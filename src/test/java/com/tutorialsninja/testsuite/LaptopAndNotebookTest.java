package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopAndNotebookTest extends BaseTest {
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        laptopsAndNotebooksPage.mouseHoverOnLaptopsAndNotebooksTadAndClick();
        //2.2 Click on “Show All Laptops & Notebooks”
        laptopsAndNotebooksPage.clickOnShowAllLaptopAndNotebooks();
        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortByPriceHighToLow();
        //2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.clickOnProductMacBook();
        // 2.5 Verify the text “MacBook”
        String expectedText = "MacBook";
        String actualText = laptopsAndNotebooksPage.verifyTextMacBook();
        Assert.assertEquals(expectedText,actualText,"Error message");
        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebooksPage.clickOnAddToCartButton();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedMessage = "Success: You have added MacBook to your shopping cart!";
        String actualMessage = laptopsAndNotebooksPage.getAddedMacBookText();
        boolean message =actualMessage.contains(expectedMessage.trim());
        Assert.assertTrue(message);
        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNotebooksPage.clickOnShoppingCartLink();
        //2.9 Verify the text "Shopping Cart"
        String expectedText1 = "Shopping Cart  (0.00kg)";
        String actualText1 = laptopsAndNotebooksPage.verifyTextShoppingCart();
        Assert.assertEquals(expectedText1,actualText1,"Error message");
        //2.10 Verify the Product name "MacBook"
        String expectedProduct = "MacBook";
        String actualProduct = laptopsAndNotebooksPage.verifyProductNameMacBook();
        Assert.assertEquals(expectedProduct,actualProduct,"Error message");

        //2.11 Change Quantity "2"
        laptopsAndNotebooksPage.changeQuantity();
        //2.12 Click on “Update” Tab
        laptopsAndNotebooksPage.clickOnUpdate();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        String expectedMessage1 = "Success: You have modified your shopping cart!";
        String actualMessage1 = laptopsAndNotebooksPage.verifyModifiedYourShoppingCart();
        boolean message1 =actualMessage1.contains(expectedMessage1.trim());
        Assert.assertTrue(message1);
        //2.14 Verify the Total £737.45
        String expectedTotal = "$1,204.00";
        String actualTotal = laptopsAndNotebooksPage.verifyTotal();
        Assert.assertEquals(expectedTotal,actualTotal,"Error message");
        //2.15 Click on “Checkout” button
        laptopsAndNotebooksPage.clickOnCheckoutButton();
        //2.16 Verify the text “Checkout”
        String expectedText2 = "Checkout";
        String actualText2 = laptopsAndNotebooksPage.verifyTextCheckout();
        Assert.assertEquals(expectedText2,actualText2,"Error message");
        //2.17 Verify the Text “New Customer”
        String expectedText3 = "New Customer";
        //String actualText3 = laptopsAndNotebooksPage.verifyTextNewCustomer();
        //Assert.assertEquals(expectedText3,actualText3,"Error message");
        //2.18 Click on “Guest Checkout” radio button
        laptopsAndNotebooksPage.clickOnGuestCheckout();
        //2.19 Click on “Continue” tab
        Thread.sleep(2000);
        laptopsAndNotebooksPage.clickOnContinueTab();
        //2.20 Fill the mandatory fields
        laptopsAndNotebooksPage.enterFirstName("Zara");
        laptopsAndNotebooksPage.enterLastName("Lee");
        laptopsAndNotebooksPage.enterEmail("zara123@gmail.com");
        laptopsAndNotebooksPage.enterTelephone("0779563425");
        laptopsAndNotebooksPage.enterAddress("190,Harrow view");
        laptopsAndNotebooksPage.enterCity("London");
        laptopsAndNotebooksPage.enterPostcode("HA0 5AD");
        laptopsAndNotebooksPage.enterCountry("United Kingdom");
        laptopsAndNotebooksPage.enterRegion("Devon");
        Thread.sleep(2000);
        //2.21 Click on “Continue” Button
        laptopsAndNotebooksPage.clickOnContinueButton();
        //2.22 Add Comments About your order into text area
        laptopsAndNotebooksPage.addCommentAboutYourOrderIntoTextArea("All is Well");
        //2.23 Check the Terms & Conditions check box
        laptopsAndNotebooksPage.clickOnTermsAndConditionBox();
        //2.24 Click on “Continue” button
        laptopsAndNotebooksPage.clickOnContinueButton();
        //2.25 Verify the message “Warning: Payment method required!”
        String expectedMessage2 = "Warning: Payment method required!";
        String actualMessage2 = laptopsAndNotebooksPage.verifyWarningMessage();
        boolean message2 =actualMessage2.contains(expectedMessage2.trim());
        Assert.assertTrue(message2);


    }
}
