package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountsPage extends Utility {
    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By textRegisterAccount = By.xpath("//h1[contains(text(),'Register Account')]");
    By textReturningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By firstNameField = By.id("input-firstname");
    By lastNameField = By.id("input-lastname");
    By emailField = By.id("input-email");
    By telephoneField = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By passwordConfirm = By.id("input-confirm");
    By radioBtn = By.xpath("//fieldset[3]//input");
    By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueBtn = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By accountCreated = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueBtn1 = By.xpath("//a[contains(text(),'Continue')]");
    By textMyAccount = By.xpath("//h2[normalize-space()='My Account']");
    By loginBtn = By.xpath("//input[@value='Login']");
    By logoutBtn = By.linkText("Logout");
    By textAccountLogout = By.xpath("//h1[contains(text(),'Account Logout')]");


    public void selectMyAccountOptions(String option) {

        clickOnElement(By.linkText("My Account"));
        List<WebElement> optionsList = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li/a"));
        for (WebElement element : optionsList) {
            if (element.getText().equalsIgnoreCase(option)) {
                clickOnElement(element);
                break;
            }
        }
    }

    public void clickOnMyAccount() {
        clickOnElement(myAccount);
    }

    public String verifyTextRegisterAccount() {
        return getTextFromElement(textRegisterAccount);
    }

    public String verifyTextReturningCustomer() {
        return getTextFromElement(textReturningCustomer);
    }
    public void clickOnMyAccountBtn(){
        clickOnElement(myAccount);
    }


    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String randomEmail) {
        sendTextToElement(emailField, randomEmail);
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String password) {
        sendTextToElement(passwordConfirm, password);
    }

    public void clickOnRadioButton() {
        clickOnElement(radioBtn);
    }

    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
    }

    public String verifyMessageAccountCreated() {
        return getTextFromElement(accountCreated);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueBtn);
    }

    public void clickOnMyAccountLink(){
        clickOnElement(myAccount);
    }

    public String verifyTextAccountLogout() {
        return getTextFromElement(textAccountLogout);
    }

    public void clickOnContinueBtn() {
        clickOnElement(continueBtn);
    }
    public void clickOnAccount(){
        clickOnElement(myAccount);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }

    public String verifyTextMyAccount() {
        return getTextFromElement(textMyAccount);
    }
    public void clickOnMyAccountTab(){
        clickOnElement(myAccount);
    }
    public void clickOnLogoutButton(){
        clickOnElement(logoutBtn);
    }
    public String verifyTextAccountLogout1(){
        return getTextFromElement(textAccountLogout);
    }
    public void clickOnContinue(){
        clickOnElement(continueBtn);
    }

}









