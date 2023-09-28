package project2AutoExcercise;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Upto10Test extends BaseClasss {
	
	Upto10 use2;
	
	@Test(priority = 6)
	public void TC6() throws InterruptedException, Exception {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use.verifyHomepage();
		use2.clickContactUs();
		use2.verifyInTouch();
		use2.fillContactUs("ExcelR", "excelr@gmail.com", "My last order", "Order not deliverd yet");
		use2.uploadFile("C:\\Users\\prati\\eclipse-workspace\\AutomationExcercise\\src\\main\\java\\project2AutoExcercise\\ContactUs");
		use2.clickSubmitContactUs();
		use2.clickAlertOK();
		use2.verifySuccessContactus();
		use2.homeFromContactUs();
	}
	
	@Test(priority = 7)
	public void TC7() throws InterruptedException, Exception {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use.verifyHomepage();
		use2.clickTestCases();
		use2.verifyTCsVisible();
	}
	
	@Test(priority = 8)
	public void TC8() throws InterruptedException, Exception {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use.verifyHomepage();
		use2.clickProductsTab();
		use2.verifyAllProductPage();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(308,6000)");
		use2.clickView1st();
		use2.verifyProductDetails();
	}
	
	@Test(priority = 9)
	public void TC9()  {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use.verifyHomepage();
		use2.clickProductsTab();
		use2.verifyAllProductPage();
		use2.typeProductandClick("Winter Top");
		use2.verifyRelatedToSearch();
	}
	
	@Test(priority = 10)
	public void TC10()  {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use.verifyHomepage();
		use2.scrollDownToFooter();
		use2.verifySubscription();
		use2.typeSubscriptionEmailandClick("abcc123@gmail.com");
		use2.verifySubscriptionSuccessfull();
		
	}
	

}
