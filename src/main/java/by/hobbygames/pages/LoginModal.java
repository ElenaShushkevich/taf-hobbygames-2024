package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.LoginModalLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginModal extends JSExecutor {
    public LoginModal() {
        this.driver = Driver.getDriver();
    }

    public void clickEnterButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginModalLocators.SUBMIT_BTH_XPATH)));
        driver.findElement(By.xpath(LoginModalLocators.SUBMIT_BTH_XPATH)).click();
        waitJSLoad();
    }

    public String getPhoneOrEmailError() {
        waitJSLoad();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginModalLocators.ERROR_FOR_EMAIL_FIELD_XPATH)));
        return driver.findElement(By.xpath(LoginModalLocators.ERROR_FOR_EMAIL_FIELD_XPATH)).getText();
    }

    public String getPasswordError() {
        waitJSLoad();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginModalLocators.ERROR_FOR_PASSWORD_FIELD_XPATH)));
        return driver.findElement(By.xpath(LoginModalLocators.ERROR_FOR_PASSWORD_FIELD_XPATH)).getText();
    }

    public void enterPhoneOrEmail(int phone) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginModalLocators.INPUT_EMAIL_OR_PHONE_FIELD_XPATH)));
        driver.findElement(By.xpath(LoginModalLocators.INPUT_EMAIL_OR_PHONE_FIELD_XPATH)).sendKeys(String.valueOf(phone));
    }

    public void enterPhoneOrEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginModalLocators.INPUT_EMAIL_OR_PHONE_FIELD_XPATH)));
        driver.findElement(By.xpath(LoginModalLocators.INPUT_EMAIL_OR_PHONE_FIELD_XPATH)).sendKeys(email);
    }

    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginModalLocators.INPUT_PASSWORD_FIELD_XPATH)));
        driver.findElement(By.xpath(LoginModalLocators.INPUT_PASSWORD_FIELD_XPATH)).sendKeys(password);
    }
}
