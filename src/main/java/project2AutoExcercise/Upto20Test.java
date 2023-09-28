package project2AutoExcercise;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Upto20Test extends BaseClasss {
	
	Upto10 use2;
	Upto15 use3;
	Upto20 use4;
	
	@Test(priority = 16) //(Ram1298@gmail.com , over1234)
	public void TC16() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use.verifyHomepage();
		{	use.clickSignupLogin();
			use.Signup("Ram", "Ram1298@gmail.com");
			use3.fillDetailsSignup();
			use3.verifyAccCreatedClickContinue();
			use.clickLogout();
		}
		use.clickSignupLogin();
		use.Login("Ram1298@gmail.com", "over1234");
		use.verifyLoginAs();
		use2.clickProductsTab();
		use3.clickAddToCart1();
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
	
	@Test(priority = 17) //(Ram1298@gmail.com , over1234)
	public void TC17() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use.verifyHomepage();
		use3.clickAddToCart1();
		use3.clickContinueShopping();
		use3.clickAddToCart2();
		use3.clickContinueShopping();
		use3.clickCartTab();
		use3.verifyCartPage();
		use4.ClickXremoveProd();
		use4.verifyProductisRemoved();
	}
	
	@Test(priority = 18) 
	public void TC18() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use4.verifyCategory();
		use4.ClickTopInWoman();
		use4.verifyTopInWoman();
		use4.ClickTshirtInMen();
		use4.verifyTshirtInMen();
	}
	
	@Test(priority = 19) 
	public void TC19() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use.verifyHomepage();
		use2.clickProductsTab();
		use4.verifyBrands();
		use4.clickAndVerifyPoloBrands();
		use4.clickAndVerifyHandMBrands();
	}
	
	@Test(priority = 20) 
	public void TC20() {
		use = new Upto5(driver);
		use2 = new Upto10(driver);
		use3 = new Upto15(driver);
		use4 = new Upto20(driver);
		use.verifyHomepage();
		use2.clickProductsTab();
		use2.verifyAllProductPage();
		use2.typeProductandClick("Top");
		use2.verifySearchedProduct();
		use2.verifyRelatedToSearch();
		use3.clickAddToCart1();
		use3.clickContinueShopping();
		use3.clickCartTab();
		use4.verifyProductInCart();
		use.clickSignupLogin();
		use.Login("Over999@gmail.com","over999k");
		use3.clickCartTab();
		use4.verifyProductInCart();
	}

}
