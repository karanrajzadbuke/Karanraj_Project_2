package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    public WebElement Signup;
    @FindBy(xpath = "//input[contains(@name, 'name')]")
    public WebElement EnterName;
    @FindBy(xpath = "(//input[contains(@name, 'email')])[2]")
    public WebElement EnterEmail;
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement NewSignup;
    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement SelectTitle;
    @FindBy(xpath = "//input[contains(@name, 'password')]")
    public WebElement EnterPassword;
    @FindBy(xpath = "//select[contains(@name, 'days')]")
    public WebElement SelectDate;
    @FindBy(xpath = "//select[contains(@name, 'months')]")
    public WebElement SelectMonth;
    @FindBy(xpath = "//select[contains(@name, 'years')]")
    public WebElement SelectYear;
    @FindBy(xpath = "//input[contains(@name, 'newsletter')]")
    public WebElement SelectNewsLetterCheckbox;
    @FindBy(xpath = "//input[contains(@name, 'optin')]")
    public WebElement SelectOfferPartnerCheckbox;
    @FindBy(xpath = "//input[contains(@name, 'first_name')]")
    public WebElement EnterFirstName;
    @FindBy(xpath = "//input[contains(@name, 'last_name')]")
    public WebElement EnterLastName;
    @FindBy(xpath = "//input[contains(@name, 'company')]")
    public WebElement EnterCompanyName;
    @FindBy(xpath = "//input[contains(@name, 'address1')]")
    public WebElement EnterAddress1;
    @FindBy(xpath = "//input[contains(@name, 'address2')]")
    public WebElement EnterAddress2;
    @FindBy(xpath = "//select[contains(@name, 'country')]")
    public WebElement SelectCountry;
    @FindBy(xpath = "//input[contains(@name, 'state')]")
    public WebElement EnterState;
    @FindBy(xpath = "//input[contains(@name, 'city')]")
    public WebElement EnterCity;
    @FindBy(xpath = "//input[contains(@name, 'zipcode')]")
    public WebElement EnterZipcode;
    @FindBy(xpath = "//input[contains(@name, 'mobile_number')]")
    public WebElement EnterMobileNo;
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    public WebElement ClickOnCreateAccount;
    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    public WebElement VerifyCreateAccount;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement ClickOnContinue;
    @FindBy(xpath = "//b[contains(text(),'')]")
    public WebElement VerifyLoginUser;
    @FindBy(xpath = "//a[contains(@href, 'delete_account')]")
    public WebElement ClickOnDeleteAccount;
    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    public WebElement VerifyDeleteAccount;
    @FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
    public WebElement VerifyLoginToYourAccount;
    @FindBy(xpath = "(//input[contains(@name, 'email')])[1]")
    public WebElement EnterEmailAddress;
    @FindBy(xpath = "//input[contains(@name, 'password')]")
    public WebElement EnterLoginPassword;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement ClickOnLogin;
    @FindBy(xpath = "//a[contains(text(),' Logged in as ')]")
    public WebElement VerifyLoginAsUsername;
    @FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
    public WebElement VerifyIncorrectLoginCredential;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    public WebElement ClickOnLogout;
    @FindBy(xpath = "//p[contains(text(),'Email Address already exist!')]")
    public WebElement VerifyEmailAlreadyExist;
    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    public WebElement ClickOnContactUs;
    @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
    public WebElement VerifyGetInTouch;
    @FindBy(xpath = "//input[contains(@name, 'name')]")
    public WebElement EnterNameHelp;
    @FindBy(xpath = "//input[contains(@name, 'email')]")
    public WebElement EnterEmailHelp;
    @FindBy(xpath = "//input[contains(@name, 'subject')]")
    public WebElement EnterSubjectHelp;
    @FindBy(xpath = "//textarea[contains(@name, 'message')]")
    public WebElement EnterTextAreaHelp;
    @FindBy(xpath = "//input[contains(@name, 'submit')]")
    public WebElement ClickOnSubmitHelp;
    @FindBy(xpath = "(//div[contains(text(),'Success! Your details have been submitted successfully.')])[1]")
    public WebElement VerifySuccessMsg;
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement ClickOnHomeButton;
    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    public WebElement ClickOnTestCase;
    @FindBy(xpath = "//b[contains(text(),'Test Cases')]")
    public WebElement VerifyTestCase;
    @FindBy(xpath = "//a[contains(text(),'Products')]")
    public WebElement ClickOnProduct;
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement VerifyAllProduct;
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    public WebElement ClickOnViewProduct;
    @FindBy(xpath = "(//h2[contains(text(),'')])[3]")
    public WebElement VerifyProductName;
    @FindBy(xpath = "//p[contains(text(),'Category')]")
    public WebElement VerifyProductCategory;
    @FindBy(xpath = "//span[contains(text(),'Rs.')]")
    public WebElement VerifyProductPrice;
    @FindBy(xpath = "//p[contains(text(),'Stock')]")
    public WebElement VerifyProductAvailibility;
    @FindBy(xpath = "(//p[contains(text(),'')])[5]")
    public WebElement VerifyProductCondition;
    @FindBy(xpath = "(//p[contains(text(),'')])[6]")
    public WebElement VerifyProductBrand;
    @FindBy(xpath = "//input[contains(@name, 'search')]")
    public WebElement ProductSearch;
    @FindBy(xpath = "//button[contains(@id, 'submit_search')]")
    public WebElement ProductSearchSubmit;
    @FindBy(xpath = "//h2[contains(text(),'Searched Products')]")
    public WebElement VerifySearchProduct;
    @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
    public WebElement VerifySubscription;
    @FindBy(xpath = "//input[contains(@id, 'susbscribe_email')]")
    public WebElement SubscriptionEmail;
    @FindBy(xpath = "//button[contains(@id, 'subscribe')]")
    public WebElement ClickOnSubscribe;
    @FindBy(xpath = "//div[contains(text(),'You have been successfully subscribed!')]")
    public WebElement VerifySuccessfulSubscribe;
    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    public WebElement ClickOnCart;
    @FindBy(xpath = "(//div[contains(@class, 'productinfo text-center')])[1]")
    public WebElement HoverOverFirstProduct;
    @FindBy(xpath = "(//div[contains(@class, 'productinfo text-center')])[2]")
    public WebElement HoverOverSecondProduct;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[2]")
    public WebElement ClickOnAddFirstProduct;
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    public WebElement ClickOnAddSecondProduct;
    @FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
    public WebElement ClickOnContinueShopping;
    @FindBy(xpath = "//u[contains(text(),'View Cart')]")
    public WebElement ClickOnViewCart;
    @FindBy(xpath = "//a[contains(@href, 'product_details/1')]")
    public WebElement VerifyFirstProductInCart;
    @FindBy(xpath = "//a[contains(@href, 'product_details/2')]")
    public WebElement VerifySecondProductInCart;
    @FindBy(xpath = "(//p[contains(text(),'Rs.')])[1]")
    public WebElement VerifyFirstProductPrice;
    @FindBy(xpath = "(//button[contains(text(),'')])[2]")
    public WebElement VerifyFirstProductQuantity;
    @FindBy(xpath = "(//p[contains(text(),'Rs.')])[2]")
    public WebElement VerifyFirstProductTotalPrice;
    @FindBy(xpath = "(//p[contains(text(),'Rs.')])[3]")
    public WebElement VerifySecondProductPrice;
    @FindBy(xpath = "(//button[contains(text(),'')])[3]")
    public WebElement VerifySecondProductQuantity;
    @FindBy(xpath = "(//p[contains(text(),'Rs.')])[4]")
    public WebElement VerifySecondProductTotalPrice;
    @FindBy(xpath = "//div[contains(@class, 'product-information')]")
    public WebElement VerifyHomepageProductDetails;
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    public WebElement HomepageProductQuantity;
    @FindBy(xpath = "//button[contains(@type, 'button')]")
    public WebElement HomepageProductAddToCart;
    @FindBy(xpath = "(//button[contains(text(),'')])[2]")
    public WebElement VerifyHomepageProductQuantity;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[1]")
    public WebElement AddHomepageProduct1ToCart;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[3]")
    public WebElement AddHomepageProduct2ToCart;
    @FindBy(xpath = "//li[contains(text(),'Shopping Cart')]")
    public WebElement VerifyCart;
    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    public WebElement ClickOnProceedToCheckout;
    @FindBy(xpath = "//u[contains(text(),'Register / Login')]")
    public WebElement ClickOnRegLogin;
    @FindBy(xpath = "//h2[contains(text(),'Address Details')]")
    public WebElement VerifyAddressDetails;
    @FindBy(xpath = "//h2[contains(text(),'Review Your Order')]")
    public WebElement VerifyReviewOrder;
    @FindBy(xpath = "//textarea[contains(@name, 'message')]")
    public WebElement CommentText;
    @FindBy(xpath = "//a[contains(text(),'Place Order')]")
    public WebElement ClickOnPlaceOrder;
    @FindBy(xpath = "//input[contains(@name, 'name_on_card')]")
    public WebElement PaymentName;
    @FindBy(xpath = "//input[contains(@name, 'card_number')]")
    public WebElement PaymentCardNo;
    @FindBy(xpath = "//input[contains(@name, 'cvc')]")
    public WebElement PaymentCardCVV;
    @FindBy(xpath = "//input[contains(@name, 'expiry_month')]")
    public WebElement PaymentCardExpiryMonth;
    @FindBy(xpath = "//input[contains(@name, 'expiry_year')]")
    public WebElement PaymentCardExpiryYear;
    @FindBy(xpath = "//button[contains(text(),'Pay and Confirm Order')]")
    public WebElement ClickOnPayAndConfirmOrder;
    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been confirmed!')]")
    public WebElement VerifySuccessMessage;
    @FindBy(xpath = "//span[contains(text(),'Close')]")
    public WebElement ClickOnAdvertiseClose;
    @FindBy(xpath = "(//a[contains(@class, 'cart_quantity_delete')])[1]")
    public WebElement RemoveFirstProductFromCart;
    @FindBy(xpath = "(//a[contains(@class, 'cart_quantity_delete')])[2]")
    public WebElement RemoveSecondProductFromCart;
    @FindBy(xpath = "//b[contains(text(),'Cart is empty!')]")
    public WebElement VerifyCartEmpty;
    @FindBy(xpath = "//h2[contains(text(),'Category')]")
    public WebElement VerifyCategory;
    @FindBy(xpath = "(//i[contains(@class, 'plus')])[1]")
    public WebElement ClickOnWomensCategory;
    @FindBy(xpath = "(//a[contains(text(),'Dress')])[1]")
    public WebElement ClickOnWomensDress;
    @FindBy(xpath = "//h2[contains(text(),'Women - Dress Products')]")
    public WebElement VerifyWomenDressProductPage;
    @FindBy(xpath = "(//i[contains(@class, 'plus')])[2]")
    public WebElement ClickOnMensCategory;
    @FindBy(xpath = "//a[contains(text(),'Tshirts')]")
    public WebElement ClickOnMensTshirts;
    @FindBy(xpath = "//h2[contains(text(),'Men - Tshirts Products')]")
    public WebElement VerifyMenTShirtProductPage;
    @FindBy(xpath = "//h2[contains(text(),'Brands')]")
    public WebElement VerifyBrand;
    @FindBy(xpath = "(//a[contains(@href, 'brand_products')])[1]")
    public WebElement ClickOnFirstBrand;
    @FindBy(xpath = "//h2[contains(text(),'Brand -')]")
    public WebElement VerifyFirstBrandPage;
    @FindBy(xpath = "(//div[contains(@class, 'product-overlay')])[1]")
    public WebElement VerifyFirstBrandProduct;
    @FindBy(xpath = "(//a[contains(@href, 'brand_products')])[2]")
    public WebElement ClickOnSecondBrand;
    @FindBy(xpath = "//h2[contains(text(),'Brand -')]")
    public WebElement VerifySecondBrandPage;
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement VerifyAllProductPage;
    @FindBy(xpath = "//input[contains(@name, 'search')]")
    public WebElement SearchProduct;
    @FindBy(xpath = "//button[contains(@type, 'button')]")
    public WebElement ClickOnSearch;
    @FindBy(xpath = "//h2[contains(text(),'Searched Products')]")
    public WebElement VerifySearch;
    @FindBy(xpath = "(//div[contains(@class, 'product-overlay')])[1]")
    public WebElement VerifyFirstSearchProduct;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[1]")
    public WebElement AddFirstSearchProduct;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[3]")
    public WebElement AddSecondSearchProduct;
    @FindBy(xpath = "//a[contains(text(),'Write Your Review')]")
    public WebElement VerifyWriteReview;
    @FindBy(xpath = "//input[contains(@id, 'name')]")
    public WebElement ReviewName;
    @FindBy(xpath = "(//input[contains(@id, 'email')])[1]")
    public WebElement ReviewEmail;
    @FindBy(xpath = "//textarea[contains(@id, 'review')]")
    public WebElement AddReview;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement SubmitReview;
    @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
    public WebElement VerifySubmitReview;
    @FindBy(xpath = "//h2[contains(text(),'recommended items')]")
    public WebElement VerifyRecomendedProduct;
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[69]")
    public WebElement AddRecomendedProduct1ToCart;
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[72]")
    public WebElement AddRecomendedProduct2ToCart;
    @FindBy(xpath = "(//li[contains(@class, 'address_firstname')])[1]")
    public WebElement VerifyDeliveryAddressName;
    @FindBy(xpath = "(//li[contains(@class, 'address_firstname')])[2]")
    public WebElement VerifyBillingAddressName;
    @FindBy(xpath = "(//li[contains(@class, 'address_address1')])[1]")
    public WebElement VerifyDeliveryCompanyName;
    @FindBy(xpath = "(//li[contains(@class, 'address_firstname')])[4]")
    public WebElement VerifyBillingCompanyName;
    @FindBy(xpath = "(//li[contains(@class, 'address_city')])[1]")
    public WebElement VerifyDeliveryAddress;
    @FindBy(xpath = "(//li[contains(@class, 'address_city')])[2]")
    public WebElement VerifyBillingAddress;
    @FindBy(xpath = "//u[contains(text(),'Register / Login')]")
    public WebElement ClickOnRegLogIn;
    @FindBy(xpath = "//a[contains(text(),'Download Invoice')]")
    public WebElement ClickOnDownloadInvoice;
    @FindBy(xpath = "//i[contains(@class, 'fa fa-angle-up')]")
    public WebElement ClickOnRightSideUpArrow;
    @FindBy(xpath = "//h2[contains(text(),'Full-Fledged practice website for Automation Engineers')]")
    public WebElement VerifyFullFledgeText;

    public void Login(String username, String password) {
        EnterEmailAddress.sendKeys(username);
        EnterLoginPassword.sendKeys(password);
        ClickOnLogin.click();
    }

    public void NewUserSignup(String Name, String Email) {
        EnterName.sendKeys(Name);
        EnterEmail.sendKeys(Email);
        NewSignup.click();
    }
}