package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    By laptopsAndNotebooksTab = By.linkText("Laptops & Notebooks");

    By allLaptopsAndNotebooks = By.linkText("Show AllLaptops & Notebooks");
    By priceHighToLow = By.id("input-sort");
    By allProductsPrice = By.xpath("//div[@class='row']//p[@class='price']");
    By productMacBook = By.linkText("MacBook");
    By macBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By macBookAddedText = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText = By.xpath("//div[@id='content']//h1");

    By productNameMacBook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By quantity2 = By.xpath("//input[contains(@name, 'quantity')]");
    By update = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modifiedCart = By.xpath("//div[@id='checkout-cart']/div[1]");
    By total = By.xpath("//tbody//tr//td[6]");
    By checkoutButton = By.xpath("//a[@class='btn btn-primary']");
    By textCheckout = By.xpath("//h1[normalize-space()='Checkout']");
    By textNewCustomer = By.xpath("//h1[normalize-space()='New Customer']");
    By guestCheckout = By.xpath("//label[normalize-space()='Guest Checkout']");
    By continueTab = By.xpath("//input[@id='button-account'])[1]");
    By firstNameField = By.name("firstname");
    By lastNameField = By.name("lastname");
    By emailField = By.id("input-payment-email");
    By telephoneField = By.name("telephone");
    By addressField = By.name("address_1");
    By cityField = By.id("input-payment-city");
    By postcodeField = By.name("postcode");
    By countryField = By.id("input-payment-country");
    By regionField = By.name("zone_id");
    By continueButton = By.xpath("//input[@id='button-guest']");
    By commentField = By.xpath("//textarea[@name='comment']");
    By termsAndConditionBox = By.xpath("//input[@name='agree']");
    By continueButton1 = By.xpath("//input[@id='button-payment-method']");
    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    //Mouse hover on Laptops & Notebooks Tab.and click
    public void mouseHoverOnLaptopsAndNotebooksTadAndClick() {
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
    }

    //Click on “Show All Laptops & Notebooks”
    public void clickOnShowAllLaptopAndNotebooks() {
        clickOnElement(allLaptopsAndNotebooks);
    }

    //Select Sort By "Price (High > Low)"
    public void selectSortByPriceHighToLow() {
        selectByVisibleTextFromDropDown(priceHighToLow, "Price (High > Low)");
    }
    //Verify the Product price will arrange in High to Low order.

    public List<WebElement> returnListOfProductsPriceElementsLocator() {
        List<WebElement> listOfElements = driver.findElements(allProductsPrice);
        return listOfElements;
    }
    //Select Product “MacBook”
    public void clickOnProductMacBook(){
        clickOnElement(productMacBook);
    }
    //Verify the text “MacBook”
    public String verifyTextMacBook(){
        return getTextFromElement(macBookText);
    }
    //Click on ‘Add To Cart’ button
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }
    //Verify the message “Success: You have added MacBook to your shopping cart!”
    public String getAddedMacBookText(){
        return getTextFromElement(macBookAddedText);
    }
    //Click on link “shopping cart” display into success message
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCart);
    }
    //Verify the text "Shopping Cart"
    public String verifyTextShoppingCart(){
        return getTextFromElement(shoppingCartText);
    }
    //Verify the Product name "MacBook"
    public String verifyProductNameMacBook(){
        return getTextFromElement(productNameMacBook );
    }
    // Change Quantity "2"
    public void changeQuantity(){
        clearValueFromTextBox(quantity2);
        sendTextToElement(quantity2,"2");
    }
    //Click on “Update” Tab
    public void clickOnUpdate(){
        clickOnElement(update);
    }
    //Verify the message “Success: You have modified your shopping cart!”
    public String verifyModifiedYourShoppingCart(){
        return getTextFromElement(modifiedCart);
    }
    //Verify the Total £737.45
    public String verifyTotal(){
        return getTextFromElement(total);
    }
    //Click on “Checkout” button
    public void clickOnCheckoutButton(){
        clickOnElement(checkoutButton);
    }
    //Verify the text “Checkout”
    public String verifyTextCheckout(){
        return getTextFromElement(textCheckout);
    }
    //Verify the Text “New Customer”
    public String verifyTextNewCustomer(){
        return getTextFromElement(textNewCustomer);
    }
    // Click on “Guest Checkout” radio button
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }
    //Click on “Continue” tab
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
    //Enter Firstname
    public void enterFirstName(String firstName ){
        sendTextToElement(firstNameField,firstName);
    }
    //Enter Lastname
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    //Enter EmailId
    public void enterEmail(String email){
      sendTextToElement(emailField,email);
    }
    //Enter TelephoneNumber
    public void enterTelephone(String telephone){
       sendTextToElement(telephoneField,telephone);
    }
    //Enter Address
    public void enterAddress(String address){
      sendTextToElement(addressField,address);
    }
    //Enter CityName
    public void enterCity(String city){
    sendTextToElement(cityField,city);
    }
    //Enter Postcode
    public void enterPostcode(String postcode){
       sendTextToElement(postcodeField,postcode);
    }
    //Enter CountryName
    public void enterCountry(String country){
      sendTextToElement(countryField,country);
    }
    //Enter RegionName
    public void enterRegion(String region){
        sendTextToElement(regionField,region);
    }
    //Click on “Continue” Button
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    //Add Comments About your order into text area
    public void addCommentAboutYourOrderIntoTextArea(String comment){
        sendTextToElement(commentField,comment);
    }
    //Check the Terms & Conditions check box
    public void clickOnTermsAndConditionBox(){
        clickOnElement(termsAndConditionBox);
    }
    // Click on “Continue” button
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    //Verify the message “Warning: Payment method required!”
    public String verifyWarningMessage(){
        return getTextFromElement(warningMessage);
    }

}