package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktopLink = By.linkText("Desktops");
    By laptopAndNotebooksLink = By.linkText("Laptops & Notebooks");
    By componentsLinks = By.linkText("Components");
    By currencyTab = By.xpath("//span[contains(text(),'Currency')]");
    By currencyList = By.xpath("//ul@class='dropdown-menu']/li");

    By desktopsTab = By.linkText("Desktops");
    By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopsAndNotebooksTab = By.linkText("Laptops & Notebooks");
    By laptopsAndNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By componentsTab = By.linkText("Components");
    By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(topMenu);
        }
    }
    // Mouse hover on “Desktops” Tab and click
    public void mouseHoverOnDesktopsLinkAndClick() {
        mouseHoverToElementAndClick(desktopLink);
    }
    // Mouse hover on “Laptops & Notebooks” Tab and click
        public void mouseHoverOnLaptopsAndBooksLinkAndClick(){
        mouseHoverToElementAndClick(laptopAndNotebooksLink );
    }
    // Mouse hover on “Components” Tab and click
    public void MouseHoverOnComponentsAndClick(){
        mouseHoverToElementAndClick(componentsLinks);
    }
    //Verify the text ‘Desktops’
public String getDesktopsText(){
        return getTextFromElement(desktopText );
    }
    // Verify the text ‘Laptops & Notebooks’

public String getLaptopsAndNotebooksText(){
        return getTextFromElement(laptopsAndNotebooksText);
}
public String getComponentsText(){
        return getTextFromElement(componentsText );
}

}