package by.hobbygames.ui.pages;

import by.hobbygames.ui.driver.Driver;
import by.hobbygames.ui.locators.CheckoutPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends JSExecutor {
    public CheckoutPage() {
        super.driver = Driver.getDriver();
    }

    public String getCheckoutTitle(){
        return driver.findElement(By.xpath(CheckoutPageLocators.CHECKOUT_TITLE_XPATH)).getText();
    }
    public String getTitleOfOrder(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.ITEM_IN_BASKET_XPATH)));
        return driver.findElement(By.xpath(CheckoutPageLocators.ITEM_IN_BASKET_XPATH)).getText();
    }
    public void clickNextBTNAtCheckoutPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.NEXT_BTN)));
        driver.findElement(By.xpath(CheckoutPageLocators.NEXT_BTN)).click();
    }
    public void enterName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.NAME_INPUT_FIELD_XPATH)));
        driver.findElement(By.xpath(CheckoutPageLocators.NAME_INPUT_FIELD_XPATH)).sendKeys("Елена");
    }

    public void enterEmail() {
        driver.findElement(By.xpath(CheckoutPageLocators.EMAIL_INPUT_FIELD_XPATH)).sendKeys("test@test.com");
    }

    public void enterPhone() {
        waitJSLoad();
        driver.findElement(By.xpath(CheckoutPageLocators.PHONE_INPUT_FIELD_XPATH)).sendKeys("123456789");
    }

    public void clickNextBTNForContact() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.CONTACT_NEXT_BTN_XPATH)));
        driver.findElement(By.xpath(CheckoutPageLocators.CONTACT_NEXT_BTN_XPATH)).click();
    }


    public String getEnteredContactsData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.CONTACTS_DATA_XPATH)));
        return driver.findElement(By.xpath(CheckoutPageLocators.CONTACTS_DATA_XPATH)).getText();
    }
    public String getDeliveryHeader() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.DELIVERY_TITLE_XPATH)));
        return driver.findElement(By.xpath(CheckoutPageLocators.DELIVERY_TITLE_XPATH)).getText();
    }

    public String getErrorMessageAtDeliveryPart() {
        waitJSLoad();
        return driver.findElement(By.xpath(CheckoutPageLocators.DELIVERY_ERROR_XPATH)).getText();
    }

    public void clickNextButtonAtDeliveryPart() {
        waitJSLoad();
        driver.findElement(By.xpath(CheckoutPageLocators.DELIVERY_NEXT_BTN_XPATH)).click();
    }

    public String getErrorMessageWithoutStoresDeliveryPart() {
        waitJSLoad();
        return driver.findElement(By.xpath(CheckoutPageLocators.ERROR_MESSAGE_WITHOUT_STORES_XPATH)).getText();
    }

    public void clickRadioButtonPickUpFromStores() {
        waitJSLoad();
        driver.findElement(By.xpath(CheckoutPageLocators.RADIO_BTN_PICKUP_FROM_STORES_XPATH)).click();
    }

    public void clickSelectFromStoresList() {
        waitJSLoad();
        driver.findElement(By.xpath(CheckoutPageLocators.SELECT_FROM_LIST_BTN_XPATH)).click();
    }

    public void clickSelectPalazzoStore() {
        waitJSLoad();
        driver.findElement(By.xpath(CheckoutPageLocators.PALAZZO_STORES_XPATH)).click();
    }

    public String getAddedStoreName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.ADDED_STORES_TO_DELIVERY)));
        return driver.findElement(By.xpath(CheckoutPageLocators.ADDED_STORES_TO_DELIVERY)).getText();
    }

    public String getMethodPayment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.PAYMENT_METHOD_XPATH)));
        return driver.findElement(By.xpath(CheckoutPageLocators.PAYMENT_METHOD_XPATH)).getText();
    }
}
