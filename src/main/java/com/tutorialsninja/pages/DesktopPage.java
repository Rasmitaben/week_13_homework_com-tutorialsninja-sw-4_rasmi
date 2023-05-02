package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

    By desktopTab = By.linkText("Desktops");
    By showAllDesktops = By.linkText("Show AllDesktops");
    By allProductsName = By.xpath("//h4/a");
    By positionByZToA = By.id("input-sort");
    By positionByAToZ = By.id("input-sort");
    By productHPLp3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    By textHPLp3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By calender = By.xpath("//div[@class = 'input-group date']//button");
    By monthYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By yearMonth = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By day = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");

    By quantity = By.xpath("//input[@id='input-quantity']");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    //By shoppingCartLink = By.xpath("/a[normalize-space()='shopping cart']");
    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By productHPLp3065Text = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By product21 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");

    By totalPriceText = By.xpath("(//td[contains(text(),'$122.00')])[4]");

    // Mouse hover on Desktops Tab.and click
    public void mouseHoverOnDesktopsTabAndClick() {
        mouseHoverToElementAndClick(desktopTab);
    }

    // Click on “Show All Desktops”
    public void ClickOnShowAllDesktops() {
        clickOnElement(showAllDesktops);
    }

    //Select Sort By position "Name: Z to A"
    public void selectPositionByZtoA() {
        selectByVisibleTextFromDropDown(positionByZToA, "Name (Z - A)");
    }

    //Verify the Product will arrange in Descending order
    public List<WebElement> returnListOfProductNamesElementsLocator() {
        List<WebElement> listOfElements = driver.findElements(allProductsName);
        return listOfElements;
    }

    //Select Sort By position "Name: A to Z"
    public void selectPositionByAtoZ() {
        selectByVisibleTextFromDropDown(positionByAToZ, "Name (A - Z)");
    }

    //Select product “HP LP3065”
    public void clickOnProductHPLP3065() {
        clickOnElement(productHPLp3065);
    }

    //Verify the Text "HP LP3065"
    public String getTextHPLP3065() {
        return getTextFromElement(textHPLp3065);
    }

    //Select Delivery Date "2022-11-30"
    public void selectDateFromCalender() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(calender);
        while (true) {
            String monthAndYear = driver.findElement(monthYear).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(yearMonth);
            }
        }
        List<WebElement> allDates = driver.findElements(day);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    //Enter Qty "1” using Select class.
    public void enterQuantity() {
        sendTextToElement(quantity, "1");
    }

    //Click on “Add to Cart” button
    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    //Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    public String getSuccessText() {
        return getTextFromElement(successMessage);
    }

    //Click on link “shopping cart” display into success message
    public void clickOnShoppingCart() {
        clickOnElement(shoppingCartLink);
    }

    //Verify the text "Shopping Cart"
    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    // Verify the Product name "HP LP3065"
    public String getProductNameHPLP3065() {
        return getTextFromElement(productHPLp3065Text);
    }

    //Verify the Delivery Date "2022-11-30"
    public String verifyDeliveryDate() {
        return getTextFromElement(deliveryDate);
    }

    // Verify the Model "Product21"
    public String verifyModelProduct21() {
        return getTextFromElement(product21);
    }

    //Verify the Totat "£74.73"
    public String verifyTotalPrice() {
        return getTextFromElement(totalPriceText);
    }
}









