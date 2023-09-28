package project2AutoExcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Upto26Test extends BaseClasss {
	Upto10 use2;
	Upto15 use3;
	Upto20 use4;
	Upto26 use5;

	
	@Test(priority = 21) 
	public void TC21() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use5 = new Upto26(driver);
		use.verifyHomepage();
		use2.clickProductsTab();
		use2.verifyAllProductPage();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(308,6000)");
		use2.clickView1st();
		use5.verifyReviewSection();
		use5.typeReview("excelR", "excelr@gmail.com", "Review for the Product");
		use5.clickSubmitReview();
		use5.verifySuccessofReview();
	}
	
	@Test(priority = 22) 
	public void TC22() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use5 = new Upto26(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7600)");
		use5.verifyRecomendedItems();
		use5.clickAddtoCRecom();
		use3.clickViewCart();
		use5.verifyProductInCart();
	}
	
	@Test(priority = 23) //(Ram1298@gmail.com , over1234)
	public void TC23() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use5 = new Upto26(driver);
		use.verifyHomepage();
		use.clickSignupLogin();
		use.Signup("Ram", "Ram1298@gmail.com");
		use3.fillDetailsSignup();
		use3.verifyAccCreatedClickContinue();
		use.verifyLoginAs();
		use2.clickProductsTab();
		use3.clickAddToCart1();
		use3.clickContinueShopping();
		use3.clickAddToCart2();
		use3.clickContinueShopping();
		use3.clickCartTab();
		use3.verifyCartPage();
		use3.clickProceedToChecko();
		use3.verifyAddressReviewOrder();
		use5.compareDeliveryAddressWithRegisteredAddress();
		use5.compareBillingAddressWithRegisteredAddress();
		use.clickDeleteAcc();
		use.verifyAccDel();
	}
	
	@Test(priority = 24) //(Ram1298@gmail.com , over1234)
	public void TC24() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use5 = new Upto26(driver);
		use.verifyHomepage();
		use.clickSignupLogin();
		use.Signup("Ram", "Ram1298@gmail.com");
		use3.fillDetailsSignup();
		use3.verifyAccCreatedClickContinue();
		use.verifyLoginAs();
		use2.clickProductsTab();
		use3.clickAddToCart1();
		use3.clickContinueShopping();
		use3.clickAddToCart2();
		use3.clickContinueShopping();
		use3.clickCartTab();
		use3.verifyCartPage();
		use3.clickProceedToChecko();
		use3.verifyAddressReviewOrder();
		use3.typeDescriptnClickPlaceOrder("Abc abc, Xyzxyz.");
		use3.typePaymentDetails("Ram", "987465413210", "619"," 08", "2025");
		use3.clickPayAndConfirm();
		use3.verifyOrderPlacedsuccess();
		use5.clickDownloadInvoice();
		use5.verifyInvoiceIsDownloaded();
		use5.clickContinueAftDownload();
		use.clickDeleteAcc();
		use.verifyAccDel();
	}
	
	@Test(priority = 25)
	public void TC25() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use5 = new Upto26(driver);
		use.verifyHomepage();
		use3.scrollDownToFooterCart();
		use2.verifySubscription();
		use5.clickScrollUpArrow();
		use5.verifyFullFledgeAtTop();
	}
	
	@Test(priority = 26)
	public void TC26() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use5 = new Upto26(driver);
		use.verifyHomepage();
		use3.scrollDownToFooterCart();
		use2.verifySubscription();
		use5.ScrollUpToTop();
		use5.verifyFullFledgeAtTop();
	}
}
