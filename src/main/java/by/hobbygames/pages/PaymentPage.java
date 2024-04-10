package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.PaymentPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    WebDriver driver;

    public PaymentPage() {
        this.driver = Driver.getDriver();
    }
    public String getMethodPayment(){
        return driver.findElement(By.xpath(PaymentPageLocators.PAYMENT_METHOD_XPATH)).getText();
    }

}
