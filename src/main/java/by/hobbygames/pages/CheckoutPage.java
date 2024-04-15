package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.CheckoutPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage() {
        this.driver = Driver.getDriver();
    }

    public String getCheckoutTitle(){
        return driver.findElement(By.xpath(CheckoutPageLocators.CHECKOUT_TITLE_XPATH)).getText();
    }
    public String getTitleOfOrder(){

        return driver.findElement(By.xpath(CheckoutPageLocators.ITEM_IN_BASKET_XPATH)).getText();
    }
    public void clickNextBTNAtCheckoutPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageLocators.NEXT_BTN)));
        driver.findElement(By.xpath(CheckoutPageLocators.NEXT_BTN)).click();
    }
}
