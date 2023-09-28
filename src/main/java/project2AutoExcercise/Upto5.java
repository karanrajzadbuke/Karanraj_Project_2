package project2AutoExcercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Upto5 extends BaseClasss{
	
	Upto5Test testcases;
	
	@FindBy(xpath = "//img[@src='/static/images/home/logo.png']")WebElement siteLogo;
	@FindBy(xpath = "//a[@href='/login']")WebElement SignupLoginTab;
	@FindBy(xpath = "//h2[text()='New User Signup!']")WebElement newSignupH2;
	@FindBy(name = "name")WebElement nameinSignup;
	@FindBy(xpath = "//input[@data-qa='signup-email']")WebElement emailinSignup;
	@FindBy(xpath = "//button[text()='Signup']")WebElement signupButtonBT;
	@FindBy(xpath = "//b[text()='Enter Account Information']")WebElement EAccInfo;
	@FindBy(xpath = "//a[text()=' Delete Account']")WebElement deleteAccTab;
	@FindBy(xpath = "//a[text()=' Logged in as ']")WebElement loginAs;
	@FindBy(xpath = "//b[text()='Account Deleted!']")WebElement accDeleted;
	@FindBy(xpath = "//a[text()=' Logout']")WebElement logoutTab;
	@FindBy(xpath = "//h2[text()='Login to your account']")WebElement loginAccH2;
	@FindBy(xpath = "//input[@data-qa='login-email']")WebElement emeilInLogin;
	@FindBy(xpath = "//input[@name='password']")WebElement passInLogin;
	@FindBy(xpath = "//button[text()='Login']")WebElement loginButton;
	@FindBy(xpath = "//p[text()='Your email or password is incorrect!']")WebElement incorrectAlert;
	@FindBy(xpath = "//p[text()='Email Address already exist!']")WebElement emailexistAlert;
	
	Upto5(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);}
	
	public void verifyHomepage() {
		boolean sLogo = siteLogo.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(sLogo, true);
	}
	public void clickSignupLogin() {
		SignupLoginTab.click();
	}
	public void Signup(String signupName, String signupEmail) {
		nameinSignup.sendKeys(signupName);
		emailinSignup.sendKeys(signupEmail);
		signupButtonBT.click();
		
	}
	
	public void clickDeleteAcc() {
		deleteAccTab.click();
	}
	public void createAccandLogout() {
		use = new Upto5(driver);
		use.Signup("OverOver","Over90@gmail.com");
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
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		use.clickLogout();
	}
	public void verifyLoginAs() {
		boolean logAs = loginAs.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(logAs, true);
	}
	public void verifyAccDel() {
		boolean accDel = accDeleted.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(accDel, true);
	}
	public void verifyLogintoAcc() {
		boolean loginH2 = loginAccH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(loginH2, true);
	}
	public void clickLogout() {
		logoutTab.click();
	}
	public void Login(String LoginEmail, String LoginPass) {
		emeilInLogin.sendKeys(LoginEmail);
		passInLogin.sendKeys(LoginPass);
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void verifyIncorrectAlert() {
		boolean loginAlert = incorrectAlert.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(loginAlert, true);
	}
	public void verifySignup() {
		boolean sighupH2 = newSignupH2.isDisplayed();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(sighupH2, true);
	}
	public void verifyemailExistAlert() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean emailAlert = emailexistAlert.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(emailAlert, true);
	}
}
