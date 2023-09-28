package Tests;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AutomationExercise extends BaseTest{
    @Test
    public void RegisterUser() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String expectedSignupTitle = row.getCell(2).getStringCellValue();
            String Name = row.getCell(3).getStringCellValue();
            String Email = row.getCell(4).getStringCellValue();
            String ExpectedAccountInfoTitle = row.getCell(5).getStringCellValue();
            String password = row.getCell(6).getStringCellValue();
            double numericValue1 = row.getCell(7).getNumericCellValue();
            int intValue1 = (int) numericValue1;
            String date = String.valueOf(intValue1);
            String month = row.getCell(8).getStringCellValue();
            double numericValue2 = row.getCell(9).getNumericCellValue();
            int intValue2 = (int) numericValue2;
            String year = String.valueOf(intValue2);
            String firstName = row.getCell(10).getStringCellValue();
            String lastName = row.getCell(11).getStringCellValue();
            String CompanyName = row.getCell(12).getStringCellValue();
            String address1 = row.getCell(13).getStringCellValue();
            String address2 = row.getCell(14).getStringCellValue();
            String country = row.getCell(15).getStringCellValue();
            String state = row.getCell(16).getStringCellValue();
            String city = row.getCell(17).getStringCellValue();
            double numericValue3 = row.getCell(18).getNumericCellValue();
            int intValue3 = (int) numericValue3;
            String zipcode = String.valueOf(intValue3);
            double numericValue4 = row.getCell(19).getNumericCellValue();
            int intValue4 = (int) numericValue4;
            String mobileNo = String.valueOf(intValue4);

            try {
            Page page = new Page(driver);
            String actualHomepageTitle = driver.getTitle();
            Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
            page.Signup.click();
            String actualSignupTitle = driver.getTitle();
            Assert.assertEquals(expectedSignupTitle, actualSignupTitle);
            page.EnterName.sendKeys(Name);
            page.EnterEmail.sendKeys(Email);
            page.NewSignup.click();
            String ActualEnterAccountInfoTitle = driver.getTitle();
            Assert.assertEquals(ExpectedAccountInfoTitle, ActualEnterAccountInfoTitle);
            page.SelectTitle.click();
            page.EnterPassword.sendKeys(password);
            Select select1 = new Select(page.SelectDate);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scroll(300, 0);");
            select1.selectByVisibleText(date);
            Select select2 = new Select(page.SelectMonth);
            select2.selectByVisibleText(month);
            Select select3 = new Select(page.SelectYear);
            select3.selectByVisibleText(year);
            page.SelectNewsLetterCheckbox.click();
            page.SelectOfferPartnerCheckbox.click();
            page.EnterFirstName.sendKeys(firstName);
            js.executeScript("window.scroll(300, 0);");
            page.EnterLastName.sendKeys(lastName);
            page.EnterCompanyName.sendKeys(CompanyName);
            page.EnterAddress1.sendKeys(address1);
            page.EnterAddress2.sendKeys(address2);
            js.executeScript("window.scroll(300, 0);");
            Select select4 = new Select(page.SelectCountry);
            select4.selectByVisibleText(country);
            page.EnterState.sendKeys(state);
            page.EnterCity.sendKeys(city);
            js.executeScript("window.scroll(300, 0);");
            page.EnterZipcode.sendKeys(zipcode);
            page.EnterMobileNo.sendKeys(mobileNo);
            page.ClickOnCreateAccount.click();
            boolean displayed = page.VerifyCreateAccount.isDisplayed();
            Assert.assertEquals(displayed, true);
            page.ClickOnContinue.click();
            String ActualLogUserName = page.VerifyLoginUser.getText();
            Assert.assertEquals(firstName, ActualLogUserName);
            page.ClickOnDeleteAccount.click();
            boolean displayed1 = page.VerifyDeleteAccount.isDisplayed();
            Assert.assertEquals(displayed1, true);
            page.ClickOnContinue.click();
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void LoginUserCorrect() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(1);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String email = row.getCell(1).getStringCellValue();
            String password = row.getCell(2).getStringCellValue();
            String expectedHomepageTitle = row.getCell(3).getStringCellValue();
            try {
            Page page = new Page(driver);
            String actualHomepageTitle = driver.getTitle();
            Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
            page.Signup.click();
            boolean displayed = page.VerifyLoginToYourAccount.isDisplayed();
            Assert.assertEquals(displayed, true);
            page.Login(email,password);
            boolean displayed1 = page.VerifyLoginAsUsername.isDisplayed();
            Assert.assertEquals(displayed1, true);
            page.ClickOnDeleteAccount.click();
            boolean displayed2 = page.VerifyDeleteAccount.isDisplayed();
            Assert.assertEquals(displayed2, true);
        } catch (NoSuchElementException | TimeoutException e) {
            driver.switchTo().alert().dismiss();
        }
        }
    }
    @Test
    public void LoginUserInCorrect() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(2);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String email = row.getCell(1).getStringCellValue();
            String password = row.getCell(2).getStringCellValue();
            String expectedHomepageTitle = row.getCell(3).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.Signup.click();
                boolean displayed = page.VerifyLoginToYourAccount.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.Login(email,password);
                boolean displayed1 = page.VerifyIncorrectLoginCredential.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }
    @Test
    public void LogOutUser() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(3);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String email = row.getCell(1).getStringCellValue();
            String password = row.getCell(2).getStringCellValue();
            String expectedHomepageTitle = row.getCell(3).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.Signup.click();
                boolean displayed = page.VerifyLoginToYourAccount.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.Login(email,password);
                boolean displayed1 = page.VerifyLoginAsUsername.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.ClickOnLogout.click();
                boolean displayed2 = page.VerifyLoginToYourAccount.isDisplayed();
                Assert.assertEquals(displayed2, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }
    @Test
    public void RegisterWithExistingEmail() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(4);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String Name = row.getCell(1).getStringCellValue();
            String Email = row.getCell(2).getStringCellValue();
            String expectedHomepageTitle = row.getCell(3).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.Signup.click();
                boolean displayed = page.VerifyLoginToYourAccount.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.EnterName.sendKeys(Name);
                page.EnterEmail.sendKeys(Email);
                page.NewSignup.click();
                boolean displayed1 = page.VerifyEmailAlreadyExist.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }
    @Test
    public void ContactUs() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(5);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String Name = row.getCell(2).getStringCellValue();
            String Email = row.getCell(3).getStringCellValue();
            String Subject = row.getCell(4).getStringCellValue();
            String TextArea = row.getCell(5).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.ClickOnContactUs.click();
                boolean displayed = page.VerifyGetInTouch.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.EnterNameHelp.sendKeys(Name);
                page.EnterEmailHelp.sendKeys(Email);
                page.EnterSubjectHelp.sendKeys(Subject);
                page.EnterTextAreaHelp.sendKeys(TextArea);
                page.ClickOnSubmitHelp.click();
                driver.switchTo().alert().accept();
                boolean displayed1 = page.VerifySuccessMsg.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.ClickOnHomeButton.click();
                boolean displayed2 = page.VerifyGetInTouch.isDisplayed();
                Assert.assertEquals(displayed2, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }
    @Test
    public void VerifyTestCasePage() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.ClickOnTestCase.click();
                boolean displayed = page.VerifyTestCase.isDisplayed();
                Assert.assertEquals(displayed, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void VerifyProductDetailPage() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.ClickOnProduct.click();
                boolean displayed = page.VerifyAllProduct.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.ClickOnViewProduct.click();
                boolean displayed1 = page.VerifyProductName.isDisplayed();
                Assert.assertEquals(displayed1, true);
                boolean displayed2 = page.VerifyProductCategory.isDisplayed();
                Assert.assertEquals(displayed2, true);
                boolean displayed3 = page.VerifyProductPrice.isDisplayed();
                Assert.assertEquals(displayed3, true);
                boolean displayed4 = page.VerifyProductAvailibility.isDisplayed();
                Assert.assertEquals(displayed4, true);
                boolean displayed5 = page.VerifyProductCondition.isDisplayed();
                Assert.assertEquals(displayed5, true);
                boolean displayed6 = page.VerifyProductBrand.isDisplayed();
                Assert.assertEquals(displayed6, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void SearchProductPage() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String searchName = row.getCell(2).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.ClickOnProduct.click();
                boolean displayed = page.VerifyAllProduct.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.ProductSearch.sendKeys(searchName);
                page.ProductSearchSubmit.click();
                boolean displayed1 = page.VerifySearchProduct.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void VerifySubscriptionPage() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String subscriptionEmail = row.getCell(3).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                boolean displayed = page.VerifySubscription.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.SubscriptionEmail.sendKeys(subscriptionEmail);
                page.ClickOnSubscribe.click();
                boolean displayed1 = page.VerifySuccessfulSubscribe.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void VerifySubscriptionCartPage() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String subscriptionEmail = row.getCell(3).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.ClickOnCart.click();
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                boolean displayed = page.VerifySubscription.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.SubscriptionEmail.sendKeys(subscriptionEmail);
                page.ClickOnSubscribe.click();
                boolean displayed1 = page.VerifySuccessfulSubscribe.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void AddProduct() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.ClickOnProduct.click();
                boolean displayed = page.VerifyAllProduct.isDisplayed();
                Assert.assertEquals(displayed, true);
                Actions actions = new Actions(driver);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scroll(200, 0);");
                actions.moveToElement(page.HoverOverFirstProduct).perform();
                page.ClickOnAddFirstProduct.click();
                page.ClickOnContinueShopping.click();
                actions.moveToElement(page.HoverOverSecondProduct).perform();
                page.ClickOnAddSecondProduct.click();
                page.ClickOnViewCart.click();
                boolean displayed1 = page.VerifyFirstProductInCart.isDisplayed();
                Assert.assertEquals(displayed1, true);
                boolean displayed2 = page.VerifySecondProductInCart.isDisplayed();
                Assert.assertEquals(displayed2, true);
                boolean displayed3 = page.VerifyFirstProductPrice.isDisplayed();
                Assert.assertEquals(displayed3, true);
                boolean displayed4 = page.VerifyFirstProductQuantity.isDisplayed();
                Assert.assertEquals(displayed4, true);
                boolean displayed5 = page.VerifyFirstProductTotalPrice.isDisplayed();
                Assert.assertEquals(displayed5, true);
                boolean displayed6 = page.VerifySecondProductPrice.isDisplayed();
                Assert.assertEquals(displayed6, true);
                boolean displayed7 = page.VerifySecondProductQuantity.isDisplayed();
                Assert.assertEquals(displayed7, true);
                boolean displayed8 = page.VerifySecondProductTotalPrice.isDisplayed();
                Assert.assertEquals(displayed8, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void VerifyProductQuantity() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            double numericValue1 = row.getCell(4).getNumericCellValue();
            int intValue1 = (int) numericValue1;
            String quantity = String.valueOf(intValue1);
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                Actions actions = new Actions(driver);
                actions.moveToElement(page.ClickOnViewProduct).click().perform();
                boolean displayed1 = page.VerifyHomepageProductDetails.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.HomepageProductQuantity.clear();
                page.HomepageProductQuantity.sendKeys(quantity);
                page.HomepageProductAddToCart.click();
                page.ClickOnViewCart.click();
                String actualQuantity = page.VerifyHomepageProductQuantity.getText();
                Assert.assertEquals(quantity, actualQuantity);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void PlaceOrderRegWhileCheckout() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(7);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String Name = row.getCell(2).getStringCellValue();
            String Email = row.getCell(3).getStringCellValue();
            String password = row.getCell(4).getStringCellValue();
            double numericValue1 = row.getCell(5).getNumericCellValue();
            int intValue1 = (int) numericValue1;
            String date = String.valueOf(intValue1);
            String month = row.getCell(6).getStringCellValue();
            double numericValue2 = row.getCell(7).getNumericCellValue();
            int intValue2 = (int) numericValue2;
            String year = String.valueOf(intValue2);
            String firstName = row.getCell(8).getStringCellValue();
            String lastName = row.getCell(9).getStringCellValue();
            String CompanyName = row.getCell(10).getStringCellValue();
            String address1 = row.getCell(11).getStringCellValue();
            String address2 = row.getCell(12).getStringCellValue();
            String country = row.getCell(13).getStringCellValue();
            String state = row.getCell(14).getStringCellValue();
            String city = row.getCell(15).getStringCellValue();
            double numericValue3 = row.getCell(16).getNumericCellValue();
            int intValue3 = (int) numericValue3;
            String zipcode = String.valueOf(intValue3);
            double numericValue4 = row.getCell(17).getNumericCellValue();
            int intValue4 = (int) numericValue4;
            String mobileNo = String.valueOf(intValue4);
            String comment = row.getCell(18).getStringCellValue();
            String cardName = row.getCell(19).getStringCellValue();
            double numericValue5 = row.getCell(20).getNumericCellValue();
            int intValue5 = (int) numericValue5;
            String cardNo = String.valueOf(intValue5);
            double numericValue6 = row.getCell(21).getNumericCellValue();
            int intValue6 = (int) numericValue6;
            String cvc = String.valueOf(intValue6);
            double numericValue7 = row.getCell(22).getNumericCellValue();
            int intValue7 = (int) numericValue7;
            String expiryMonth = String.valueOf(intValue7);
            double numericValue8 = row.getCell(23).getNumericCellValue();
            int intValue8 = (int) numericValue8;
            String expiryYear = String.valueOf(intValue8);
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.AddHomepageProduct1ToCart.click();
                page.ClickOnContinueShopping.click();
                page.AddHomepageProduct2ToCart.click();
                page.ClickOnContinueShopping.click();
                page.ClickOnCart.click();
                boolean displayed1 = page.VerifyCart.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.ClickOnProceedToCheckout.click();
                page.ClickOnRegLogin.click();
                page.NewUserSignup(Name,Email);
                page.SelectTitle.click();
                page.EnterPassword.sendKeys(password);
                Select select1 = new Select(page.SelectDate);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scroll(300, 0);");
                select1.selectByVisibleText(date);
                Select select2 = new Select(page.SelectMonth);
                select2.selectByVisibleText(month);
                Select select3 = new Select(page.SelectYear);
                select3.selectByVisibleText(year);
                page.SelectNewsLetterCheckbox.click();
                page.SelectOfferPartnerCheckbox.click();
                page.EnterFirstName.sendKeys(firstName);
                js.executeScript("window.scroll(300, 0);");
                page.EnterLastName.sendKeys(lastName);
                page.EnterCompanyName.sendKeys(CompanyName);
                page.EnterAddress1.sendKeys(address1);
                page.EnterAddress2.sendKeys(address2);
                js.executeScript("window.scroll(300, 0);");
                Select select4 = new Select(page.SelectCountry);
                select4.selectByVisibleText(country);
                page.EnterState.sendKeys(state);
                page.EnterCity.sendKeys(city);
                js.executeScript("window.scroll(300, 0);");
                page.EnterZipcode.sendKeys(zipcode);
                page.EnterMobileNo.sendKeys(mobileNo);
                page.ClickOnCreateAccount.click();
                boolean displayed = page.VerifyCreateAccount.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.ClickOnContinue.click();
                String ActualLogUserName = page.VerifyLoginUser.getText();
                Assert.assertEquals(firstName, ActualLogUserName);
                page.ClickOnCart.click();
                page.ClickOnProceedToCheckout.click();
                boolean displayed2 = page.VerifyAddressDetails.isDisplayed();
                Assert.assertEquals(displayed2, true);
                boolean displayed3 = page.VerifyReviewOrder.isDisplayed();
                Assert.assertEquals(displayed3, true);
                page.CommentText.sendKeys(comment);
                page.ClickOnPlaceOrder.click();
                page.PaymentName.sendKeys(cardName);
                page.PaymentCardNo.sendKeys(cardNo);
                page.PaymentCardCVV.sendKeys(cvc);
                page.PaymentCardExpiryMonth.sendKeys(expiryMonth);
                page.PaymentCardExpiryYear.sendKeys(expiryYear);
                page.ClickOnPayAndConfirmOrder.click();
                boolean displayed4 = page.VerifySuccessMessage.isDisplayed();
                Assert.assertEquals(displayed4, true);
                page.ClickOnDeleteAccount.click();
                boolean displayed5 = page.VerifyDeleteAccount.isDisplayed();
                Assert.assertEquals(displayed5, true);
                page.ClickOnContinue.click();

            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void PlaceOrderRegBeforeCheckout() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(7);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String Name = row.getCell(2).getStringCellValue();
            String Email = row.getCell(3).getStringCellValue();
            String password = row.getCell(4).getStringCellValue();
            double numericValue1 = row.getCell(5).getNumericCellValue();
            int intValue1 = (int) numericValue1;
            String date = String.valueOf(intValue1);
            String month = row.getCell(6).getStringCellValue();
            double numericValue2 = row.getCell(7).getNumericCellValue();
            int intValue2 = (int) numericValue2;
            String year = String.valueOf(intValue2);
            String firstName = row.getCell(8).getStringCellValue();
            String lastName = row.getCell(9).getStringCellValue();
            String CompanyName = row.getCell(10).getStringCellValue();
            String address1 = row.getCell(11).getStringCellValue();
            String address2 = row.getCell(12).getStringCellValue();
            String country = row.getCell(13).getStringCellValue();
            String state = row.getCell(14).getStringCellValue();
            String city = row.getCell(15).getStringCellValue();
            double numericValue3 = row.getCell(16).getNumericCellValue();
            int intValue3 = (int) numericValue3;
            String zipcode = String.valueOf(intValue3);
            double numericValue4 = row.getCell(17).getNumericCellValue();
            int intValue4 = (int) numericValue4;
            String mobileNo = String.valueOf(intValue4);
            String comment = row.getCell(18).getStringCellValue();
            String cardName = row.getCell(19).getStringCellValue();
            double numericValue5 = row.getCell(20).getNumericCellValue();
            int intValue5 = (int) numericValue5;
            String cardNo = String.valueOf(intValue5);
            double numericValue6 = row.getCell(21).getNumericCellValue();
            int intValue6 = (int) numericValue6;
            String cvc = String.valueOf(intValue6);
            double numericValue7 = row.getCell(22).getNumericCellValue();
            int intValue7 = (int) numericValue7;
            String expiryMonth = String.valueOf(intValue7);
            double numericValue8 = row.getCell(23).getNumericCellValue();
            int intValue8 = (int) numericValue8;
            String expiryYear = String.valueOf(intValue8);
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.Signup.click();
                page.NewUserSignup(Name,Email);
                page.SelectTitle.click();
                page.EnterPassword.sendKeys(password);
                Select select1 = new Select(page.SelectDate);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scroll(300, 0);");
                select1.selectByVisibleText(date);
                Select select2 = new Select(page.SelectMonth);
                select2.selectByVisibleText(month);
                Select select3 = new Select(page.SelectYear);
                select3.selectByVisibleText(year);
                page.SelectNewsLetterCheckbox.click();
                page.SelectOfferPartnerCheckbox.click();
                page.EnterFirstName.sendKeys(firstName);
                js.executeScript("window.scroll(300, 0);");
                page.EnterLastName.sendKeys(lastName);
                page.EnterCompanyName.sendKeys(CompanyName);
                page.EnterAddress1.sendKeys(address1);
                page.EnterAddress2.sendKeys(address2);
                js.executeScript("window.scroll(300, 0);");
                Select select4 = new Select(page.SelectCountry);
                select4.selectByVisibleText(country);
                page.EnterState.sendKeys(state);
                page.EnterCity.sendKeys(city);
                js.executeScript("window.scroll(300, 0);");
                page.EnterZipcode.sendKeys(zipcode);
                page.EnterMobileNo.sendKeys(mobileNo);
                page.ClickOnCreateAccount.click();
                boolean displayed = page.VerifyCreateAccount.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.ClickOnContinue.click();
                String ActualLogUserName = page.VerifyLoginUser.getText();
                Assert.assertEquals(firstName, ActualLogUserName);
                page.AddHomepageProduct1ToCart.click();
                page.ClickOnContinueShopping.click();
                page.AddHomepageProduct2ToCart.click();
                page.ClickOnContinueShopping.click();
                page.ClickOnCart.click();
                page.ClickOnProceedToCheckout.click();
                boolean displayed2 = page.VerifyAddressDetails.isDisplayed();
                Assert.assertEquals(displayed2, true);
                boolean displayed3 = page.VerifyReviewOrder.isDisplayed();
                Assert.assertEquals(displayed3, true);
                page.CommentText.sendKeys(comment);
                page.ClickOnPlaceOrder.click();
                page.PaymentName.sendKeys(cardName);
                page.PaymentCardNo.sendKeys(cardNo);
                page.PaymentCardCVV.sendKeys(cvc);
                page.PaymentCardExpiryMonth.sendKeys(expiryMonth);
                page.PaymentCardExpiryYear.sendKeys(expiryYear);
                page.ClickOnPayAndConfirmOrder.click();
                boolean displayed4 = page.VerifySuccessMessage.isDisplayed();
                Assert.assertEquals(displayed4, true);
                page.ClickOnDeleteAccount.click();
                boolean displayed5 = page.VerifyDeleteAccount.isDisplayed();
                Assert.assertEquals(displayed5, true);
                page.ClickOnContinue.click();
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void PlaceOrderLoginBeforeCheckout() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(8);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String Email = row.getCell(2).getStringCellValue();
            String password = row.getCell(3).getStringCellValue();
            String comment = row.getCell(4).getStringCellValue();
            String cardName = row.getCell(5).getStringCellValue();
            double numericValue5 = row.getCell(6).getNumericCellValue();
            int intValue5 = (int) numericValue5;
            String cardNo = String.valueOf(intValue5);
            double numericValue6 = row.getCell(7).getNumericCellValue();
            int intValue6 = (int) numericValue6;
            String cvc = String.valueOf(intValue6);
            double numericValue7 = row.getCell(8).getNumericCellValue();
            int intValue7 = (int) numericValue7;
            String expiryMonth = String.valueOf(intValue7);
            double numericValue8 = row.getCell(9).getNumericCellValue();
            int intValue8 = (int) numericValue8;
            String expiryYear = String.valueOf(intValue8);
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.Signup.click();
                page.Login(Email,password);
                boolean displayed = page.VerifyLoginUser.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.AddHomepageProduct1ToCart.click();
                page.ClickOnContinueShopping.click();
                page.AddHomepageProduct2ToCart.click();
                page.ClickOnContinueShopping.click();
                page.ClickOnCart.click();
                boolean displayed1 = page.VerifyCart.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.ClickOnProceedToCheckout.click();
                boolean displayed2 = page.VerifyAddressDetails.isDisplayed();
                Assert.assertEquals(displayed2, true);
                boolean displayed3 = page.VerifyReviewOrder.isDisplayed();
                Assert.assertEquals(displayed3, true);
                page.CommentText.sendKeys(comment);
                page.ClickOnPlaceOrder.click();
                page.PaymentName.sendKeys(cardName);
                page.PaymentCardNo.sendKeys(cardNo);
                page.PaymentCardCVV.sendKeys(cvc);
                page.PaymentCardExpiryMonth.sendKeys(expiryMonth);
                page.PaymentCardExpiryYear.sendKeys(expiryYear);
                page.ClickOnPayAndConfirmOrder.click();
                boolean displayed4 = page.VerifySuccessMessage.isDisplayed();
                Assert.assertEquals(displayed4, true);
                page.ClickOnDeleteAccount.click();
                boolean displayed5 = page.VerifyDeleteAccount.isDisplayed();
                Assert.assertEquals(displayed5, true);
                page.ClickOnContinue.click();
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();

            }
        }
    }

    @Test
    public void RemoveProductFromCart() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(8);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();

            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.AddHomepageProduct1ToCart.click();
                page.ClickOnContinueShopping.click();
                page.AddHomepageProduct2ToCart.click();
                page.ClickOnContinueShopping.click();
                page.ClickOnCart.click();
                boolean displayed1 = page.VerifyCart.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.RemoveFirstProductFromCart.click();
                page.RemoveSecondProductFromCart.click();
                boolean displayed2 = page.VerifyCartEmpty.isDisplayed();
                Assert.assertEquals(displayed2, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void ViewCategoryProduct() throws IOException {

            try {
                Page page = new Page(driver);
                boolean displayed1 = page.VerifyCategory.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.ClickOnWomensCategory.click();
                page.ClickOnWomensDress.click();
                boolean displayed2 = page.VerifyWomenDressProductPage.isDisplayed();
                Assert.assertEquals(displayed2, true);
                page.ClickOnMensCategory.click();
                page.ClickOnMensTshirts.click();
                boolean displayed3 = page.VerifyMenTShirtProductPage.isDisplayed();
                Assert.assertEquals(displayed3, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }

    }

    @Test
    public void ViewCartBrandProduct() throws IOException {

        try {
            Page page = new Page(driver);
            page.ClickOnProduct.click();
            boolean displayed1 = page.VerifyBrand.isDisplayed();
            Assert.assertEquals(displayed1, true);
            page.ClickOnFirstBrand.click();
            boolean displayed2 = page.VerifyFirstBrandPage.isDisplayed();
            Assert.assertEquals(displayed2, true);
            boolean displayed3 = page.VerifyFirstBrandProduct.isDisplayed();
            Assert.assertEquals(displayed3, true);
            page.ClickOnSecondBrand.click();
            boolean displayed4 = page.VerifySecondBrandPage.isDisplayed();
            Assert.assertEquals(displayed4, true);
        } catch (NoSuchElementException | TimeoutException e) {

        }

    }

    @Test
    public void VerifyCartAfterLogin() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(9);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String productToSearch = row.getCell(1).getStringCellValue();
            String email = row.getCell(2).getStringCellValue();
            String password = row.getCell(3).getStringCellValue();

                Page page = new Page(driver);
                page.ClickOnProduct.click();
            try {
                boolean displayed1 = page.VerifyAllProductPage.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
                boolean displayed1 = page.VerifyAllProductPage.isDisplayed();
                Assert.assertEquals(displayed1, true);
            }
                page.SearchProduct.sendKeys(productToSearch);
                page.ClickOnSearch.click();
                boolean displayed2 = page.VerifySearch.isDisplayed();
                Assert.assertEquals(displayed2, true);
                boolean displayed3 = page.VerifyFirstSearchProduct.isDisplayed();
                Assert.assertEquals(displayed3, true);
                page.AddFirstSearchProduct.click();
                page.ClickOnContinueShopping.click();
                page.AddSecondSearchProduct.click();
                page.ClickOnContinueShopping.click();
                page.ClickOnCart.click();
                boolean displayed4 = page.VerifyCart.isDisplayed();
                Assert.assertEquals(displayed4, true);
                page.Signup.click();
                page.Login(email,password);
                page.ClickOnCart.click();
                boolean displayed5 = page.VerifyCart.isDisplayed();
                Assert.assertEquals(displayed5, true);

        }
    }

    @Test
    public void AddReview() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(10);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String name = row.getCell(1).getStringCellValue();
            String email = row.getCell(2).getStringCellValue();
            String review = row.getCell(3).getStringCellValue();
            Page page = new Page(driver);
            page.ClickOnProduct.click();
            try {
                boolean displayed1 = page.VerifyAllProductPage.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
                boolean displayed1 = page.VerifyAllProductPage.isDisplayed();
                Assert.assertEquals(displayed1, true);
            }
            page.ClickOnViewProduct.click();
            boolean displayed2 = page.VerifyWriteReview.isDisplayed();
            Assert.assertEquals(displayed2, true);
            page.ReviewName.sendKeys(name);
            page.ReviewEmail.sendKeys(email);
            page.AddReview.sendKeys(review);
            page.SubmitReview.click();
            boolean displayed4 = page.VerifySubmitReview.isDisplayed();
            Assert.assertEquals(displayed4, true);

        }
    }

    @Test
    public void AddRecomendedItem() throws IOException {
            Page page = new Page(driver);
            Actions actions = new Actions(driver);
            actions.moveToElement(page.VerifyRecomendedProduct).perform();
            boolean displayed1 = page.VerifyRecomendedProduct.isDisplayed();
            Assert.assertEquals(displayed1, true);
            try{
              page.AddRecomendedProduct1ToCart.click();
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            page.AddRecomendedProduct2ToCart.click();}
            page.ClickOnCart.click();
            boolean displayed2 = page.VerifyFirstProductInCart.isDisplayed();
            Assert.assertEquals(displayed2, true);
    }

    @Test
    public void VerifyDetailsCheckout() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(11);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String expectedSignupTitle = row.getCell(2).getStringCellValue();
            String Name = row.getCell(3).getStringCellValue();
            String Email = row.getCell(4).getStringCellValue();
            String ExpectedAccountInfoTitle = row.getCell(5).getStringCellValue();
            String password = row.getCell(6).getStringCellValue();
            double numericValue1 = row.getCell(7).getNumericCellValue();
            int intValue1 = (int) numericValue1;
            String date = String.valueOf(intValue1);
            String month = row.getCell(8).getStringCellValue();
            double numericValue2 = row.getCell(9).getNumericCellValue();
            int intValue2 = (int) numericValue2;
            String year = String.valueOf(intValue2);
            String firstName = row.getCell(10).getStringCellValue();
            String lastName = row.getCell(11).getStringCellValue();
            String CompanyName = row.getCell(12).getStringCellValue();
            String address1 = row.getCell(13).getStringCellValue();
            String address2 = row.getCell(14).getStringCellValue();
            String country = row.getCell(15).getStringCellValue();
            String state = row.getCell(16).getStringCellValue();
            String city = row.getCell(17).getStringCellValue();
            double numericValue3 = row.getCell(18).getNumericCellValue();
            int intValue3 = (int) numericValue3;
            String zipcode = String.valueOf(intValue3);
            double numericValue4 = row.getCell(19).getNumericCellValue();
            int intValue4 = (int) numericValue4;
            String mobileNo = String.valueOf(intValue4);
            String AddressName = row.getCell(20).getStringCellValue();
            String Companyname = row.getCell(21).getStringCellValue();
            String address = row.getCell(24).getStringCellValue();

            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.Signup.click();
                String actualSignupTitle = driver.getTitle();
                Assert.assertEquals(expectedSignupTitle, actualSignupTitle);
                page.EnterName.sendKeys(Name);
                page.EnterEmail.sendKeys(Email);
                page.NewSignup.click();
                String ActualEnterAccountInfoTitle = driver.getTitle();
                Assert.assertEquals(ExpectedAccountInfoTitle, ActualEnterAccountInfoTitle);
                page.SelectTitle.click();
                page.EnterPassword.sendKeys(password);
                Select select1 = new Select(page.SelectDate);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scroll(300, 0);");
                select1.selectByVisibleText(date);
                Select select2 = new Select(page.SelectMonth);
                select2.selectByVisibleText(month);
                Select select3 = new Select(page.SelectYear);
                select3.selectByVisibleText(year);
                page.SelectNewsLetterCheckbox.click();
                page.SelectOfferPartnerCheckbox.click();
                page.EnterFirstName.sendKeys(firstName);
                js.executeScript("window.scroll(300, 0);");
                page.EnterLastName.sendKeys(lastName);
                page.EnterCompanyName.sendKeys(CompanyName);
                page.EnterAddress1.sendKeys(address1);
                page.EnterAddress2.sendKeys(address2);
                js.executeScript("window.scroll(300, 0);");
                Select select4 = new Select(page.SelectCountry);
                select4.selectByVisibleText(country);
                page.EnterState.sendKeys(state);
                page.EnterCity.sendKeys(city);
                js.executeScript("window.scroll(300, 0);");
                page.EnterZipcode.sendKeys(zipcode);
                page.EnterMobileNo.sendKeys(mobileNo);
                page.ClickOnCreateAccount.click();
                boolean displayed = page.VerifyCreateAccount.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.ClickOnContinue.click();
                String ActualLogUserName = page.VerifyLoginUser.getText();
                Assert.assertEquals(firstName, ActualLogUserName);
                page.AddHomepageProduct1ToCart.click();
                page.ClickOnContinueShopping.click();
                page.AddHomepageProduct2ToCart.click();
                page.ClickOnContinueShopping.click();
                page.ClickOnCart.click();
                boolean displayed1 = page.VerifyCart.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.ClickOnProceedToCheckout.click();
                String actualDeliveryAddressName = page.VerifyDeliveryAddressName.getText();
                Assert.assertEquals(AddressName, actualDeliveryAddressName);
                String actualBillingAddressName = page.VerifyBillingAddressName.getText();
                Assert.assertEquals(AddressName, actualBillingAddressName);
                String actualDeliveryCompanyName = page.VerifyDeliveryCompanyName.getText();
                Assert.assertEquals(Companyname, actualDeliveryCompanyName);
                String actualBillingCompanyName = page.VerifyBillingCompanyName.getText();
                Assert.assertEquals(Companyname, actualBillingCompanyName);
                String actualDeliveryAddress = page.VerifyDeliveryAddress.getText();
                Assert.assertEquals(address, actualDeliveryAddress);
                String actualBillingAddress = page.VerifyBillingAddress.getText();
                Assert.assertEquals(address, actualBillingAddress);
                page.ClickOnDeleteAccount.click();
                boolean displayed2 = page.VerifyDeleteAccount.isDisplayed();
                Assert.assertEquals(displayed2, true);
                page.ClickOnContinue.click();
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void DownloadInvoice() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(11);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            String Name = row.getCell(3).getStringCellValue();
            String Email = row.getCell(4).getStringCellValue();
            String ExpectedAccountInfoTitle = row.getCell(5).getStringCellValue();
            String password = row.getCell(6).getStringCellValue();
            double numericValue1 = row.getCell(7).getNumericCellValue();
            int intValue1 = (int) numericValue1;
            String date = String.valueOf(intValue1);
            String month = row.getCell(8).getStringCellValue();
            double numericValue2 = row.getCell(9).getNumericCellValue();
            int intValue2 = (int) numericValue2;
            String year = String.valueOf(intValue2);
            String firstName = row.getCell(10).getStringCellValue();
            String lastName = row.getCell(11).getStringCellValue();
            String CompanyName = row.getCell(12).getStringCellValue();
            String address1 = row.getCell(13).getStringCellValue();
            String address2 = row.getCell(14).getStringCellValue();
            String country = row.getCell(15).getStringCellValue();
            String state = row.getCell(16).getStringCellValue();
            String city = row.getCell(17).getStringCellValue();
            double numericValue3 = row.getCell(18).getNumericCellValue();
            int intValue3 = (int) numericValue3;
            String zipcode = String.valueOf(intValue3);
            double numericValue4 = row.getCell(19).getNumericCellValue();
            int intValue4 = (int) numericValue4;
            String mobileNo = String.valueOf(intValue4);
            String comment = row.getCell(27).getStringCellValue();
            String cardName = row.getCell(28).getStringCellValue();
            double numericValue5 = row.getCell(29).getNumericCellValue();
            int intValue5 = (int) numericValue5;
            String cardNo = String.valueOf(intValue5);
            double numericValue6 = row.getCell(30).getNumericCellValue();
            int intValue6 = (int) numericValue6;
            String cvc = String.valueOf(intValue6);
            double numericValue7 = row.getCell(31).getNumericCellValue();
            int intValue7 = (int) numericValue7;
            String expiryMonth = String.valueOf(intValue7);
            double numericValue8 = row.getCell(32).getNumericCellValue();
            int intValue8 = (int) numericValue8;
            String expiryYear = String.valueOf(intValue8);

            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                page.AddHomepageProduct1ToCart.click();
                page.ClickOnContinueShopping.click();
                page.AddHomepageProduct2ToCart.click();
                page.ClickOnContinueShopping.click();
                page.ClickOnCart.click();
                boolean displayed1 = page.VerifyCart.isDisplayed();
                Assert.assertEquals(displayed1, true);
                page.ClickOnProceedToCheckout.click();
                page.ClickOnRegLogIn.click();
                page.EnterName.sendKeys(Name);
                page.EnterEmail.sendKeys(Email);
                page.NewSignup.click();
                String ActualEnterAccountInfoTitle = driver.getTitle();
                Assert.assertEquals(ExpectedAccountInfoTitle, ActualEnterAccountInfoTitle);
                page.SelectTitle.click();
                page.EnterPassword.sendKeys(password);
                Select select1 = new Select(page.SelectDate);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scroll(300, 0);");
                select1.selectByVisibleText(date);
                Select select2 = new Select(page.SelectMonth);
                select2.selectByVisibleText(month);
                Select select3 = new Select(page.SelectYear);
                select3.selectByVisibleText(year);
                page.SelectNewsLetterCheckbox.click();
                page.SelectOfferPartnerCheckbox.click();
                page.EnterFirstName.sendKeys(firstName);
                js.executeScript("window.scroll(300, 0);");
                page.EnterLastName.sendKeys(lastName);
                page.EnterCompanyName.sendKeys(CompanyName);
                page.EnterAddress1.sendKeys(address1);
                page.EnterAddress2.sendKeys(address2);
                js.executeScript("window.scroll(300, 0);");
                Select select4 = new Select(page.SelectCountry);
                select4.selectByVisibleText(country);
                page.EnterState.sendKeys(state);
                page.EnterCity.sendKeys(city);
                js.executeScript("window.scroll(300, 0);");
                page.EnterZipcode.sendKeys(zipcode);
                page.EnterMobileNo.sendKeys(mobileNo);
                page.ClickOnCreateAccount.click();
                boolean displayed = page.VerifyCreateAccount.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.ClickOnContinue.click();
                String ActualLogUserName = page.VerifyLoginUser.getText();
                Assert.assertEquals(firstName, ActualLogUserName);
                page.ClickOnCart.click();
                boolean displayed2 = page.VerifyCart.isDisplayed();
                Assert.assertEquals(displayed2, true);
                page.ClickOnProceedToCheckout.click();
                boolean displayed3 = page.VerifyAddressDetails.isDisplayed();
                Assert.assertEquals(displayed3, true);
                boolean displayed4 = page.VerifyReviewOrder.isDisplayed();
                Assert.assertEquals(displayed4, true);
                page.CommentText.sendKeys(comment);
                page.ClickOnPlaceOrder.click();
                page.PaymentName.sendKeys(cardName);
                page.PaymentCardNo.sendKeys(cardNo);
                page.PaymentCardCVV.sendKeys(cvc);
                page.PaymentCardExpiryMonth.sendKeys(expiryMonth);
                page.PaymentCardExpiryYear.sendKeys(expiryYear);
                page.ClickOnPayAndConfirmOrder.click();
                boolean displayed5 = page.VerifySuccessMessage.isDisplayed();
                Assert.assertEquals(displayed5, true);
                page.ClickOnDownloadInvoice.click();
                String filePath = "C:\\Users\\Admin\\Downloads\\invoice.txt";
                File downloadedFile = new File(filePath);
                Assert.assertTrue(downloadedFile.exists(), "Downloaded file does not exist.");
                page.ClickOnContinue.click();
                page.ClickOnDeleteAccount.click();
                boolean displayed6 = page.VerifyDeleteAccount.isDisplayed();
                Assert.assertEquals(displayed6, true);
                page.ClickOnContinue.click();
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void VerifyScrollUpUsingArrow() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                boolean displayed = page.VerifySubscription.isDisplayed();
                Assert.assertEquals(displayed, true);
                page.ClickOnRightSideUpArrow.click();
                boolean displayed1 = page.VerifyFullFledgeText.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }

    @Test
    public void VerifyScrollUpWithoutUsingArrow() throws IOException {
        String excelFilePath = "C:\\Users\\Admin\\IdeaProjects\\AutomatioExerciseP2\\src\\test\\resources\\Project.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(6);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            String expectedHomepageTitle = row.getCell(1).getStringCellValue();
            try {
                Page page = new Page(driver);
                String actualHomepageTitle = driver.getTitle();
                Assert.assertEquals(expectedHomepageTitle, actualHomepageTitle);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                boolean displayed = page.VerifySubscription.isDisplayed();
                Assert.assertEquals(displayed, true);
                js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
                boolean displayed1 = page.VerifyFullFledgeText.isDisplayed();
                Assert.assertEquals(displayed1, true);
            } catch (NoSuchElementException | TimeoutException e) {
                driver.switchTo().alert().dismiss();
            }
        }
    }
}

