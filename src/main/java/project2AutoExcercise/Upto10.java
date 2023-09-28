package project2AutoExcercise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
import org.testng.asserts.SoftAssert;

public class Upto10 extends BaseClasss {
	
	@FindBy(xpath = "//a[text()=' Contact us']")WebElement contactUsTab;
	@FindBy(xpath = "//h2[text()='Get In Touch']")WebElement getIntouchH2;
	@FindBy(xpath = "//input[@name='name']")WebElement nameInContactus;
	@FindBy(xpath = "//input[@name='email']")WebElement emailInContactus;
	@FindBy(xpath = "//input[@name='subject']")WebElement subjectInContactus;
	@FindBy(xpath = "//textarea[@name='message']")WebElement massageInContactus;
	@FindBy(xpath = "//input[@type='file']")WebElement chooseFile;
	@FindBy(xpath = "//input[@name='submit']")WebElement submitBTContactUs;
	@FindBy(xpath = "//div[@class='status alert alert-success']")WebElement successContactUs;
	@FindBy(xpath = "//a[@class='btn btn-success']")WebElement homeBTincontactUs;
	@FindBy(xpath = "//a[text()=' Test Cases']")WebElement testCaseTab;
	@FindBy(xpath = "//b[text()='Test Cases']")WebElement testCaseH2;
	@FindBy(xpath = "//a[text()=' Products']")WebElement productsTab;
	@FindBy(xpath = "//h2[text()='All Products']")WebElement allProductH2;
	@FindBy(xpath = "//a[@href='/product_details/1']")WebElement viewProduct1st;
	@FindBy(xpath = "//h2[text()='Blue Top']")WebElement productDetName;
	@FindBy(xpath = "//p[text()='Category: Women > Tops']")WebElement productDetCategory;
	@FindBy(xpath = "//span[text()='Rs. 500']")WebElement productDetPrice;
	@FindBy(xpath = "//b[text()='Availability:']")WebElement ProdDetAvailibility;
	@FindBy(xpath = "//b[text()='Condition:']")WebElement ProdDetCondition;
	@FindBy(xpath = "//b[text()='Brand:']")WebElement ProdDetBrand;
	@FindBy(xpath = "//input[@name='search']")WebElement searchBoxinProd;
	@FindBy(xpath = "//button[@type='button']")WebElement searchProductBT;
	@FindBy(xpath = "//h2[text()='Searched Products']")WebElement searchedProductH2;
	@FindBy(xpath = "//p[text()='Winter Top']")WebElement reletedToSearch;
	@FindBy(xpath = "//h2[text()='Subscription']")WebElement subscriptionH2;
	@FindBy(xpath = "//input[@id='susbscribe_email']")WebElement subscriptionEmail;
	@FindBy(xpath = "//button[@id='subscribe']")WebElement subscribeArrowBT;
	@FindBy(xpath = "//div[text()='You have been successfully subscribed!']")WebElement subscriptionSuccess;

	Upto10(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);}
	
	public void clickContactUs() {
		contactUsTab.click();
	}
	public void verifyInTouch() {
		boolean intouch = getIntouchH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(intouch, true);
	}
	public void fillContactUs(String nam, String emil, String sub, String msg) {
		nameInContactus.sendKeys(nam);
		emailInContactus.sendKeys(emil);
		subjectInContactus.sendKeys(sub);
		massageInContactus.sendKeys(msg);
	}
	public void uploadFile(String file) throws Exception, InterruptedException {
		chooseFile.sendKeys(file);
	}
	public void clickSubmitContactUs() {
		submitBTContactUs.click();
	}
	public void clickAlertOK() throws Exception {
		Alert al = driver.switchTo().alert();
		al.accept();
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void verifySuccessContactus() {
		boolean SuccessContact = successContactUs.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(SuccessContact, true);
	}
	public void homeFromContactUs() {
		use = new Upto5(driver);
		homeBTincontactUs.click();
		use.verifyHomepage();
	}
	public void clickTestCases() {
		testCaseTab.click();
	}
	public void verifyTCsVisible() {
		boolean TCs = testCaseH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(TCs, true);
	}
	public void clickProductsTab() {
		productsTab.click();
	}
	public void verifyAllProductPage() {
		boolean allProd = allProductH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(allProd, true);
	}
	public void clickView1st() {
		
		viewProduct1st.click();
	}
	public void verifyProductDetails() {
		boolean prodName = productDetName.isDisplayed();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(prodName, true);
		boolean prodCategory = productDetCategory.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(prodCategory, true);
		boolean prodPrice = productDetPrice.isDisplayed();
		SoftAssert s3 = new SoftAssert();
		s3.assertEquals(prodPrice, true);
		boolean prodAvailibility = ProdDetAvailibility.isDisplayed();
		SoftAssert s4 = new SoftAssert();
		s4.assertEquals(prodAvailibility, true);
		boolean prodCondition = ProdDetCondition.isDisplayed();
		SoftAssert s5 = new SoftAssert();
		s5.assertEquals(prodCondition, true);
		boolean prodBrand = ProdDetBrand.isDisplayed();
		SoftAssert s6 = new SoftAssert();
		s6.assertEquals(prodBrand, true);
	}
	public void typeProductandClick(String prodName) {
		searchBoxinProd.sendKeys(prodName);
		searchProductBT.click();
	}
	public void verifySearchedProduct() {
		boolean searchProd = searchedProductH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(searchProd, true);
	}
	public void verifyRelatedToSearch() {
		boolean relatedSearch = reletedToSearch.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(relatedSearch, true);
	}
	public void scrollDownToFooter() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(479, 8706)");
	}
	public void verifySubscription() {
		boolean subscriptn = subscriptionH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(subscriptn, true);
	}
	public void typeSubscriptionEmailandClick(String subEmail) {
		subscriptionEmail.sendKeys(subEmail);
		subscribeArrowBT.click();
	}
	public void verifySubscriptionSuccessfull() {
		boolean subscriptnSuccess = subscriptionSuccess.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(subscriptnSuccess, true);
	}
}
