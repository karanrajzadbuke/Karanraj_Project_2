package project2AutoExcercise;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;import javax.xml.xpath.XPath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Upto5Test extends BaseClasss {
	
	@Test(priority = 1)
	public void TC1() throws Exception{
		use = new Upto5(driver);
		
		use.verifyHomepage();
		use.clickSignupLogin();
		use.verifySignup();
		use.Signup("OverOver","Over9@gmail.com");
		boolean enterAccInfo = use.EAccInfo.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(enterAccInfo, true);
		driver.findElement(By.id("password")).sendKeys("over1234");
		WebElement day = driver.findElement(By.id("days"));
		Select obj1 = new Select(day);
		obj1.selectByValue("2");
		WebElement month = driver.findElement(By.id("months"));
		Select obj2 = new Select(month);
		obj2.selectByVisibleText("June");
		WebElement year = driver.findElement(By.id("years"));
		Select obj3 = new Select(year);
		obj3.selectByVisibleText("1993");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("Over");
		driver.findElement(By.id("last_name")).sendKeys("9000");
		driver.findElement(By.id("company")).sendKeys("ExcelR");
		driver.findElement(By.id("address1")).sendKeys("ABC Building");
		driver.findElement(By.id("address2")).sendKeys("XYZ Apartment");
		WebElement country = driver.findElement(By.id("country"));
		Select obj4 = new Select(country);
		obj4.selectByVisibleText("India");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("city")).sendKeys("Bangalore");
		driver.findElement(By.id("zipcode")).sendKeys("4441122");
		driver.findElement(By.id("mobile_number")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		boolean accCreated = driver.findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed();
		SoftAssert s3 = new SoftAssert();
		s3.assertEquals(accCreated, true);
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		use.verifyLoginAs();
		use.clickDeleteAcc();
		use.verifyAccDel();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	}
	
	@Test(priority = 2)
	public void TC2() {
		use = new Upto5(driver);
		use.clickSignupLogin();
		{
			use.createAccandLogout();
		}
		use.clickSignupLogin();
		use.Login("Over90@gmail.com","over1234");
		use.verifyLoginAs();
		use.clickDeleteAcc();
		use.verifyAccDel();
	}
	
	@Test(priority = 3)
	public void TC3() {
		use = new Upto5(driver);
		use.verifyHomepage();
		use.clickSignupLogin();
		use.verifyLogintoAcc();
		use.Login("Over900@gmail.com","over12345");
		use.verifyIncorrectAlert();
	}
	
	@Test(priority = 4)
	public void TC4() {
		use = new Upto5(driver);
		use.verifyHomepage();
		use.clickSignupLogin();
		use.verifyLogintoAcc();
		use.Login("Over999@gmail.com","over999k");
		use.verifyLoginAs();
		use.clickLogout();
		boolean loginPage = use.loginAccH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(loginPage, true);	
	}
	
	@Test(priority = 5)
	public void TC5() {
		use = new Upto5(driver);
		use.verifyHomepage();
		use.clickSignupLogin();
		use.verifySignup();
		use.Signup("OverOver","Over999@gmail.com");
		use.verifyemailExistAlert();
	}

}
