package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.DeliveryPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeliveryPage extends BasePage {

    public DeliveryPage() {
        this.driver = Driver.getDriver();
    }

    public String getDeliveryHeader() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DeliveryPageLocators.DELIVERY_TITLE_XPATH)));
        return driver.findElement(By.xpath(DeliveryPageLocators.DELIVERY_TITLE_XPATH)).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(By.xpath(DeliveryPageLocators.DELIVERY_ERROR_XPATH)).getText();
    }

    public void clickNextButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DeliveryPageLocators.NEXT_BTN_XPATH)));
        driver.findElement(By.xpath(DeliveryPageLocators.NEXT_BTN_XPATH)).click();
    }

    public String getErrorMessageWithoutStores() {
        return driver.findElement(By.xpath(DeliveryPageLocators.ERROR_MESSAGE_WITHOUT_STORES_XPATH)).getText();
    }

    public void clickRadioButtonPickUpFromStores() {
        waitJSLoad();
        driver.findElement(By.xpath(DeliveryPageLocators.RADIO_BTN_PICKUP_FROM_STORES_XPATH)).click();
    }

    public void clickSelectFromList() {
        waitJSLoad();
        driver.findElement(By.xpath(DeliveryPageLocators.SELECT_FROM_LIST_BTN_XPATH)).click();
    }

    public void clickSelectPalazzoStore() {
        waitJSLoad();
        driver.findElement(By.xpath(DeliveryPageLocators.PALAZZO_STORES_XPATH)).click();
    }

    public String getAddedStoreName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DeliveryPageLocators.ADDED_STORES_TO_DELIVERY)));
        return driver.findElement(By.xpath(DeliveryPageLocators.ADDED_STORES_TO_DELIVERY)).getText();
    }
}
