package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.mouseHoverOnDesktopsLinkAndClick();
        homePage.selectMenu("Desktops");
        //Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = homePage.getDesktopsText();
        Assert.assertEquals(expectedText,actualText,"Error message");
        homePage.mouseHoverOnLaptopsAndBooksLinkAndClick();
        homePage.selectMenu("Laptops & Notebooks");
        //Verify the text ‘Laptops & Notebooks’
        String expectedText1 = "Laptops & Notebooks";
        String actualText1 = homePage.getLaptopsAndNotebooksText();
        Assert.assertEquals(expectedText1,actualText1,"Error message");
        homePage.MouseHoverOnComponentsAndClick();
        homePage.selectMenu("Components");
        //Verify the text ‘Components’
        String expectedText2 = "Components";
        String actualText2 = homePage.getComponentsText();
        Assert.assertEquals(expectedText2,actualText2,"Error message");



    }
}