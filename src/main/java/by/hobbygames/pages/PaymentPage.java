package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.PaymentPageLocators;
import by.hobbygames.locators.SearchPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {
    WebDriver driver;

    public PaymentPage() {
        this.driver = Driver.getDriver();
    }

    public String getMethodPayment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaymentPageLocators.PAYMENT_METHOD_XPATH)));
        return driver.findElement(By.xpath(PaymentPageLocators.PAYMENT_METHOD_XPATH)).getText();
    }
}
