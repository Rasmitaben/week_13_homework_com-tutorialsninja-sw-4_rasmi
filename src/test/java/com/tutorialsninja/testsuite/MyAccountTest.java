package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
    MyAccountsPage myAccountsPage = new MyAccountsPage();
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountsPage.selectMyAccountOptions("Register");
        //Verify the text “Register Account”.
        String expectedText = "Register Account";
        String actualText = myAccountsPage.verifyTextRegisterAccount();
        Assert.assertEquals(expectedText,actualText,"Error message");
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //Call the method “selectMyAccountOptions” method and pass the parameter“Login”
        myAccountsPage.selectMyAccountOptions("Login");
        //Verify the text “Returning Customer”.
        String expectedText = "Returning Customer";
        String actualText = myAccountsPage.verifyTextReturningCustomer();
        Assert.assertEquals(expectedText,actualText,"Error message");
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        // Click on My Account Link
        myAccountsPage.clickOnMyAccountBtn();
        //Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountsPage.selectMyAccountOptions("Register");
        //Enter First Name
        myAccountsPage.enterFirstName("John");
        //Enter Last Name
        myAccountsPage.enterLastName("Wood");
        //Enter Email
        myAccountsPage.enterEmail(" randomEmail@gmail.com");
        //Enter Telephone
        myAccountsPage.enterTelephone("07895432164");
        // Enter Password
        myAccountsPage.enterPassword("Jwood123");
        //Enter Password Confirm
        myAccountsPage.enterConfirmPassword("Jwood123");
        //Select Subscribe Yes radio button
        myAccountsPage.clickOnRadioButton();
        //Click on Privacy Policy check box
        myAccountsPage.clickOnPrivacyPolicyCheckBox();
        //Click on Continue button
        myAccountsPage.clickOnContinueButton();
        //Verify the message “Your Account Has Been Created!”
        String expectedText = "Your Account Has Been Created!";
        String actualText = myAccountsPage.verifyMessageAccountCreated();
        Assert.assertEquals(expectedText,actualText,"Error message");
        //Click on Continue button
        myAccountsPage.clickOnContinueButton1();
        //Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //Call the method “selectMyAccountOptions” method and pass the parameter
        myAccountsPage.selectMyAccountOptions("My Account");
        //"Logout”
        myAccountsPage.clickOnLogoutButton();
        // Verify the text “Account Logout”
        String expectedText1 = "Account Logout";
        String actualText1 = myAccountsPage.verifyTextAccountLogout();
        Assert.assertEquals(expectedText1,actualText1,"Error message");
        //Click on Continue button
        myAccountsPage.clickOnContinueBtn();

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        // Click on My Account Link.
        myAccountsPage.clickOnAccount();
        //Call the method “selectMyAccountOptions” method and pass the parameter "Login”
        myAccountsPage.selectMyAccountOptions("Login");
        //Enter Email address
        myAccountsPage.enterEmailId("randomEmail@gmail.com");
        //Enter Password
        myAccountsPage.enterPasswordField("Jwood123");
        //Click on Login button
        myAccountsPage.clickOnLoginButton();
        // Verify text “My Account”
        String expectedText1 = "My Account";
        String actualText1 = myAccountsPage.verifyTextMyAccount();
        Assert.assertEquals(expectedText1,actualText1,"Error message");
        // Click on My Account Link.
        myAccountsPage.clickOnMyAccountTab();
        // Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        myAccountsPage.selectMyAccountOptions("Logout");
        // Verify the text “Account Logout”
        String expectedText = "Account Logout";
        String actualText = myAccountsPage.verifyTextAccountLogout1();
        Assert.assertEquals(expectedText,actualText,"Error message");
        //Click on Continue button
        myAccountsPage.clickOnContinue();
    }

}



