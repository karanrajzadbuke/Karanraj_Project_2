package project2AutoExcercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Upto20 extends BaseClasss {
	Upto15 use4;
	
	@FindBy(xpath = "//a[@class='cart_quantity_delete']")WebElement productRemoveX;
	@FindBy(xpath = "//b[text()='Cart is empty!']")WebElement cartEmptyMsg;
	@FindBy(xpath = "//h2[text()='Category']")WebElement categoryH2;
	@FindBy(xpath = "//a[@href='#Women']")WebElement womanCategory;
	@FindBy(xpath = "//a[@href='/category_products/2']")WebElement topInWomanCategory;
	@FindBy(xpath = "//h2[text()='Women - Tops Products']")WebElement womanTopsH2;
	@FindBy(xpath = "//a[@href='#Men']")WebElement menCategory;
	@FindBy(xpath = "//a[@href='/category_products/3']")WebElement tshirtInMenCategory;
	@FindBy(xpath = "//h2[text()='Men - Tshirts Products']")WebElement menTshirtH2;
	@FindBy(xpath = "//h2[text()='Brands']")WebElement brandsH2;
	@FindBy(xpath = "//a[@href='/brand_products/Polo']")WebElement poloBrand;
	@FindBy(xpath = "//h2[text()='Brand - Polo Products']")WebElement brandPoloH2;
	@FindBy(xpath = "//p[text()='Fancy Green Top']")WebElement greenTopPolo;
	@FindBy(xpath = "//a[@href='/brand_products/H&M']")WebElement hAndMBrand;
	@FindBy(xpath = "//h2[text()='Brand - H&M Products']")WebElement brandHandMH2;
	@FindBy(xpath = "//p[text()='Summer White Top']")WebElement whiteTopHandM;
	@FindBy(xpath = "//a[text()='Winter Top']")WebElement winterTopInCart;
	
	Upto20(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);}
	
	public void ClickXremoveProd() {
		productRemoveX.click();
	}
	public void verifyProductisRemoved() {
		boolean cartEmpty = cartEmptyMsg.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(cartEmpty, true);
	}
	public void verifyCategory() {
		boolean category = categoryH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(category, true);
	}
	public void ClickTopInWoman() {
		womanCategory.click();
		topInWomanCategory.click();
	}
	public void verifyTopInWoman() {
		boolean topWoman = womanTopsH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(topWoman, true);
	}
	public void ClickTshirtInMen() {
		menCategory.click();
		tshirtInMenCategory.click();
	}
	public void verifyTshirtInMen() {
		boolean tshirtMen = menTshirtH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(tshirtMen, true);
	}
	public void verifyBrands() {
		boolean brands = brandsH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(brands, true);
	}
	public void clickAndVerifyPoloBrands() {
		poloBrand.click();
		boolean poloBrands = brandPoloH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(poloBrands, true);
		boolean greenTop = greenTopPolo.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(greenTop, true);
	}
	public void clickAndVerifyHandMBrands() {
		hAndMBrand.click();
		boolean poloHandM = brandHandMH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(poloHandM, true);
		boolean whiteTop = whiteTopHandM.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s.assertEquals(whiteTop, true);
	}
	public void verifyProductInCart() {
		boolean winterTop = winterTopInCart.isDisplayed();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(winterTop, true);
	}

}
