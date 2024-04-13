package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.LoginModalLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModal {
    WebDriver driver;

    public LoginModal() {
        this.driver = Driver.getDriver();
    }
    public void clickEnterButton(){
        driver.findElement(By.xpath(LoginModalLocators.SUBMIT_BTH_XPATH)).click();
    }
    public String getPhoneOrEmailError(){
        return driver.findElement(By.xpath(LoginModalLocators.ERROR_FOR_EMAIL_FIELD_XPATH)).getText();
    }
    public String getPasswordError(){
        return driver.findElement(By.xpath(LoginModalLocators.ERROR_FOR_PASSWORD_FIELD_XPATH)).getText();
    }
    public void enterPhoneOrEmail(int phone){
       driver.findElement(By.xpath(LoginModalLocators.INPUT_EMAIL_OR_PHONE_FIELD_XPATH)).sendKeys(String.valueOf(phone));
    }
    public void enterPhoneOrEmail(String email){
        driver.findElement(By.xpath(LoginModalLocators.INPUT_EMAIL_OR_PHONE_FIELD_XPATH)).sendKeys(email);
    }
    public void enterPassword(String password){
        driver.findElement(By.xpath(LoginModalLocators.INPUT_PASSWORD_FIELD_XPATH)).sendKeys(password);
    }
}
