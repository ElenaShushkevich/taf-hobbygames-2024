package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.DeliveryPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryPage {
    WebDriver driver;

    public DeliveryPage() {
        this.driver = Driver.getDriver();
    }

    public String getDeliveryHeader() {
        return driver.findElement(By.xpath(DeliveryPageLocators.DELIVERY_TITLE_XPATH)).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(By.xpath(DeliveryPageLocators.DELIVERY_ERROR_XPATH)).getText();
    }

    public void clickNextButton() {
        driver.findElement(By.xpath(DeliveryPageLocators.NEXT_BTN_XPATH)).click();
    }
    public String getErrorMessageWithoutStores() {
        return driver.findElement(By.xpath(DeliveryPageLocators.ERROR_MESSAGE_WITHOUT_STORES_XPATH)).getText();
    }

    public void clickRadioButtonPickUpFromStores() {
        driver.findElement(By.xpath(DeliveryPageLocators.RADIO_BTN_PICKUP_FROM_STORES_XPATH)).click();
    }

    public void clickSelectFromList(){
        driver.findElement(By.xpath(DeliveryPageLocators.SELECT_FROM_LIST_BTN_XPATH)).click();
    }
    public void clickSelectPalazzoStore(){
        driver.findElement(By.xpath(DeliveryPageLocators.PALAZZO_STORES_XPATH)).click();
    }
    public String getAddedStoreName(){
        return driver.findElement(By.xpath(DeliveryPageLocators.ADDED_STORES_TO_DELIVERY)).getText();
    }
}
