package project2AutoExcercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Upto15 extends BaseClasss{
	Upto10 use2;
	
	@FindBy(xpath = "//a[text()=' Cart']")WebElement cartTab;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]")WebElement prod1;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a")WebElement prod1AddtoCart;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[1]/div[2]")WebElement prod2;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[1]/div[2]/div/a")WebElement prod2AddtoCart;
	@FindBy(xpath = "//button[text()='Continue Shopping']")WebElement continueShoppingBT;
	@FindBy(xpath = "//u[text()='View Cart']")WebElement viewCartBT;
	@FindBy(xpath = "//a[text()='Men Tshirt']")WebElement prod1InViewCart;
	@FindBy(xpath = "//a[text()='Sleeveless Dress']")WebElement prod2InViewCart;
	@FindBy(xpath = "//td[@class='price']")WebElement priceInViewCart;
	@FindBy(xpath = "//td[@class='quantity']")WebElement quantityInViewCart;
	@FindBy(xpath = "//td[@class='total']")WebElement totalInViewCart;
	@FindBy(xpath = "//a[@href='/product_details/2']")WebElement viewProduct2;
	@FindBy(xpath = "//div[@class='product-information']")WebElement productDetails;
	@FindBy(xpath = "//button[@type='button']")WebElement addToCartInProduct;
	@FindBy(xpath = "//input[@name='quantity']")WebElement quantityOfProduct;
	@FindBy(xpath = "//button[text()='4']")WebElement quantityIs4;
	@FindBy(xpath = "//li[text()='Shopping Cart']")WebElement cartPageTitle;
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")WebElement proceedToCheckoutBT;
	@FindBy(xpath = "//u[text()='Register / Login']")WebElement regLoginAftCheckout;
	@FindBy(xpath = "//b[text()='Account Created!']")WebElement accCreated;
	@FindBy(xpath = "//a[text()='Continue']")WebElement continueAftAccCreated;
	@FindBy(xpath = "//h2[text()='Address Details']")WebElement addressDetailsH2;
	@FindBy(xpath = "//h2[text()='Review Your Order']")WebElement reviewOrderH2;
	@FindBy(xpath = "//textarea[@name='message']")WebElement description;
	@FindBy(xpath = "//a[text()='Place Order']")WebElement placeOrderBT;
	@FindBy(xpath = "//input[@name='name_on_card']")WebElement nameOnCard;
	@FindBy(xpath = "//input[@name='card_number']")WebElement cardNumber;
	@FindBy(xpath = "//input[@name='cvc']")WebElement cvc;
	@FindBy(xpath = "//input[@name='expiry_month']")WebElement expiryMonth;
	@FindBy(xpath = "//input[@name='expiry_year']")WebElement expiryYear;
	@FindBy(xpath = "//button[text()='Pay and Confirm Order']")WebElement payAndConfirmOrd;
	@FindBy(xpath = "//div[@class='alert-success alert']")WebElement orderPlacedSuccessfully;
	
	Upto15(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);}
	
	public void clickCartTab() {
		cartTab.click();
	}
	public void scrollDownToFooterCart() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(697, 445)");
	}
	public void clickAddToCart1() {
		//Importing action Class
		Actions a = new Actions(driver);	
		//Creating WebElement for Job Menu
		WebElement Product1 = prod1;	
		//Moving or Hovering cursor on Job Menu
		a.moveToElement(Product1).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		prod1AddtoCart.click();
	}
	public void clickAddToCart2() {
		Actions a = new Actions(driver);	
		WebElement Product2 = prod2;	
		a.moveToElement(Product2).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		prod2AddtoCart.click();
	}
	public void clickContinueShopping() {
		continueShoppingBT.click();
	}
	public void clickViewCart() {
		viewCartBT.click();
	}
	public void verifyProductInCart() {
		boolean product1 = prod1InViewCart.isDisplayed();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(product1, true);
		boolean product2 = prod2InViewCart.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(product2, true);
	}
	public void verifyPriceQuantTotalInCart() {
		boolean price = priceInViewCart.isDisplayed();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(price, true);
		boolean quantity = quantityInViewCart.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(quantity, true);
		boolean total = totalInViewCart.isDisplayed();
		SoftAssert s3 = new SoftAssert();
		s3.assertEquals(total, true);
	}
	public void clickViewProduct2() {
		viewProduct2.click();
	}
	public void verifyProductDetails() {
		boolean prodDetail = productDetails.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(prodDetail, true);
	}
	public void clickAddToCartAftProduct() {
		addToCartInProduct.click();
	}
	public void increaseQuantityTo4(String Quant) {
		quantityOfProduct.click();
		quantityOfProduct.clear();
		quantityOfProduct.sendKeys(Quant);
	}
	public void verifyQuantity4() {
		boolean quant4 = quantityIs4.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(quant4, true);
	}
	public void verifyCartPage() {
		boolean cartPage = cartPageTitle.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(cartPage, true);
	}
	public void clickProceedToChecko() {
		proceedToCheckoutBT.click();
	}
	public void clickRegORLogin() {
		regLoginAftCheckout.click();
	}
	public void fillDetailsSignup() {
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
	}
	public void verifyAccCreatedClickContinue() {
		boolean accCreatedMsg = accCreated.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(accCreatedMsg, true);
		continueAftAccCreated.click();
	}
	public void verifyAddressReviewOrder() {
		boolean Address = addressDetailsH2.isDisplayed();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(Address, true);
		boolean order = reviewOrderH2.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(order, true);
	}
	public void typeDescriptnClickPlaceOrder(String desc) {
		description.sendKeys(desc);
		placeOrderBT.click();
	}
	public void typePaymentDetails(String name, String cnum, String cvv, String expM, String expY) {
		nameOnCard.sendKeys(name);
		cardNumber.sendKeys(cnum);
		cvc.sendKeys(cvv);
		expiryMonth.sendKeys(expM);
		expiryYear.sendKeys(expY);
	}
	public void clickPayAndConfirm() {
		payAndConfirmOrd.click();
	}
	public void verifyOrderPlacedsuccess() {
		boolean placedSuccess = orderPlacedSuccessfully.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(placedSuccess, true);
	}
}
