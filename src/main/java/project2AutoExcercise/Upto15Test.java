package project2AutoExcercise;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Upto15Test extends BaseClasss{
	Upto10 use2;
	Upto15 use3;
	
	@Test(priority = 11)
	public void TC11() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use.verifyHomepage();
		use3.clickCartTab();
		use3.scrollDownToFooterCart();
		use2.verifySubscription();
		use2.typeSubscriptionEmailandClick("xyz789@gmail.com");
		use2.verifySubscriptionSuccessfull();
	}

	@Test(priority = 12)
	public void TC12() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use.verifyHomepage();
		use2.clickProductsTab();
		use3.clickAddToCart1();
		use3.clickContinueShopping();
		use3.clickAddToCart2();
		use3.clickViewCart();
		use3.verifyProductInCart();
		use3.verifyPriceQuantTotalInCart();	
	}
	
	@Test(priority = 13)
	public void TC13() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use.verifyHomepage();
		use3.clickViewProduct2();
		use3.verifyProductDetails();
		use3.increaseQuantityTo4("4");
		use3.clickAddToCartAftProduct();
		use3.clickViewCart();
		use3.verifyQuantity4();
	}
	
	@Test(priority = 14) //(Ram1298@gmail.com , over1234)
	public void TC14() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use.verifyHomepage();
		use3.clickAddToCart1();
		use3.clickContinueShopping();
		use3.clickAddToCart2();
		use3.clickContinueShopping();
		use3.clickCartTab();
		use3.verifyCartPage();
		use3.clickProceedToChecko();
		use3.clickRegORLogin();
		use.Signup("Ram", "Ram1298@gmail.com");
		use3.fillDetailsSignup();
		use3.verifyAccCreatedClickContinue();
		use.verifyLoginAs();
		use3.clickCartTab();
		use3.clickProceedToChecko();
		use3.verifyAddressReviewOrder();
		use3.typeDescriptnClickPlaceOrder("Abc abc, Xyzxyz.");
		use3.typePaymentDetails("Ram", "987465413210", "619"," 08", "2025");
		use3.clickPayAndConfirm();
		use3.verifyOrderPlacedsuccess();
		use.clickDeleteAcc();
		use.verifyAccDel();
	}
	
	@Test(priority = 15) //(Ram1298@gmail.com , over1234)
	public void TC15() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
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
		use.clickDeleteAcc();
		use.verifyAccDel();
	}
}
