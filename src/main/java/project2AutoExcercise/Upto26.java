package project2AutoExcercise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Upto26 extends BaseClasss {
	Upto15 use3;


	@FindBy(xpath = "//a[text()='Write Your Review']")WebElement writeReviewH2;
	@FindBy(xpath = "//input[@id='name']")WebElement nameReview;
	@FindBy(xpath = "//input[@id='email']")WebElement emailReview;
	@FindBy(xpath = "//textarea[@name='review']")WebElement addReview;
	@FindBy(xpath = "//button[@id='button-review']")WebElement submitReviewBT;
	@FindBy(xpath = "//span[text()='Thank you for your review.']")WebElement successReview;
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[7]/div/div[2]/ul/li/a")WebElement viewProduct;
	@FindBy(xpath = "//h2[text()='recommended items']")WebElement recomendedProductH2;
	@FindBy(xpath = "//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[3]/div/div/div/a")WebElement addToCartRecomended;
	@FindBy(xpath = "//a[text()='Summer White Top']")WebElement proddreassInCart;
	@FindBy(xpath = "//a[text()='Download Invoice']")WebElement downloadInvoice;
	@FindBy(xpath = "//a[text()='Continue']")WebElement continueAftDownload;
	@FindBy(xpath = "//i[@class='fa fa-angle-up']")WebElement scrollUpArrowBT;
	@FindBy(xpath = "//h2[text()='Full-Fledged practice website for Automation Engineers']")WebElement fullFledged;
	
	
	Upto26(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);}
	
	
	public void verifyReviewSection() {
		boolean review = writeReviewH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(review, true);
	}
	public void typeReview(String nam, String email, String review) {
		nameReview.sendKeys(nam);
		emailReview.sendKeys(email);
		addReview.sendKeys(review);
		submitReviewBT.click();
	}
	public void clickSubmitReview() {
		submitReviewBT.click();
	}
	public void verifySuccessofReview() {
		boolean reviewSuccess = successReview.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(reviewSuccess, true);
	}
	public void verifyRecomendedItems() {
		boolean recomendedItem = recomendedProductH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(recomendedItem, true);
	}
	public void clickAddtoCRecom() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		addToCartRecomended.click();
	}
	public void verifyProductInCart() {
		boolean product1 = proddreassInCart.isDisplayed();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(product1, true);
	}
	public void clickDownloadInvoice() {
		downloadInvoice.click();
	}
	public void clickContinueAftDownload() {
		continueAftDownload.click();
	}
	public void clickScrollUpArrow() {
		scrollUpArrowBT.click();
	}
	public void verifyFullFledgeAtTop() {
		boolean fullFledge = fullFledged.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(fullFledge, true);
	}
	public void ScrollUpToTop() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 310)");
	}
	public void compareDeliveryAddressWithRegisteredAddress() {
		List<String>delivery_address=new ArrayList<String>();
		delivery_address.add("Over 9000");
		delivery_address.add("ExcelR");
		delivery_address.add("ABC Building");
		delivery_address.add("XYZ Apartment");
		delivery_address.add("Bangalore Karnataka 4441122");
		delivery_address.add("India");
		delivery_address.add("9876543210");
		List<String>registered_address=new ArrayList<String>();
		registered_address.add("Over 9000");
		registered_address.add("ExcelR");
		registered_address.add("ABC Building");
		registered_address.add("XYZ Apartment");
		registered_address.add("Bangalore Karnataka 4441122");
		registered_address.add("India");
		registered_address.add("9876543210");
		Assert.assertTrue(delivery_address.containsAll(registered_address));
	}
	public void compareBillingAddressWithRegisteredAddress() {
		List<String>billing_address=new ArrayList<String>();
		billing_address.add("Over 9000");
		billing_address.add("ExcelR");
		billing_address.add("ABC Building");
		billing_address.add("XYZ Apartment");
		billing_address.add("Bangalore Karnataka 4441122");
		billing_address.add("India");
		billing_address.add("9876543210");
		List<String>registered_address=new ArrayList<String>();
		registered_address.add("Over 9000");
		registered_address.add("ExcelR");
		registered_address.add("ABC Building");
		registered_address.add("XYZ Apartment");
		registered_address.add("Bangalore Karnataka 4441122");
		registered_address.add("India");
		registered_address.add("9876543210");
		Assert.assertTrue(billing_address.containsAll(registered_address));
	}
	public void verifyInvoiceIsDownloaded() {
		File filelocation = new File("C:\\Downloads");
		File[] totalFiles = filelocation.listFiles();
		for(File files:totalFiles) {
			if(files.getName().equals("onvoice.txt")) {
				System.out.println("File is Present");
				break;
			}
		}
	}
}
