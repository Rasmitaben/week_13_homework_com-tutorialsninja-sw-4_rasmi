package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class DesktopTest extends BaseTest {
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        desktopPage.mouseHoverOnDesktopsTabAndClick();
        desktopPage.ClickOnShowAllDesktops();
        desktopPage.selectPositionByZtoA();
        // Verify the Product will arrange in Descending order.
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(desktopPage.returnListOfProductNamesElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(desktopPage.returnListOfProductNamesElementsLocator());

        Collections.sort(expectedList);
       // Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in descending order");
        desktopPage.selectPositionByAtoZ();
        desktopPage.clickOnProductHPLP3065();
        //Verify the Text "HP LP3065"
        String expectedText1 = "HP LP3065";
        String actualText1 = desktopPage.getTextHPLP3065();
        Assert.assertEquals(expectedText1,actualText1,"Error message");
        desktopPage.selectDateFromCalender();
        desktopPage.enterQuantity();
        desktopPage.clickOnAddToCartButton();
        //Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String actualMessage = desktopPage.getSuccessText();
        //Assert.assertEquals(expectedMessage,actualMessage,"Error message");
        Thread.sleep(2000);
        desktopPage.clickOnShoppingCart();
        //Verify the text "Shopping Cart"
        String expectedText = "Shopping Cart  (11.00kg)";
        String actualText = desktopPage.getShoppingCartText();
        Assert.assertEquals(expectedText,actualText,"Error message");
        //Verify the Product name "HP LP3065"
        String expectedProduct = "HP LP3065";
        String actualProduct = desktopPage.getProductNameHPLP3065();
        Assert.assertEquals(expectedProduct,actualProduct,"Error message");
        //Verify the Delivery Date "2022-11-30"
        Thread.sleep(2000);
        String expectedDate = "Delivery Date:2023-11-30";
        String actualDate = desktopPage.verifyDeliveryDate();
        Assert.assertEquals(expectedDate,actualDate,"Error message");
        // Verify the Model "Product21"
        String expectedProduct1 = "Product21";
        String actualProduct1 = desktopPage.verifyModelProduct21();
        Assert.assertEquals(expectedProduct1,actualProduct1,"Error message");
        //Verify the Todat "£74.73"
        Thread.sleep(2000);
        String expectedPrice = "£74.73";
        String actualPrice = desktopPage.verifyTotalPrice();
        Assert.assertEquals(expectedPrice,actualPrice,"Error message");
    }

    }
