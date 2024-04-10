package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.ContactPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    WebDriver driver;

    public ContactPage() {
        this.driver = Driver.getDriver();
    }

    public void clickNameField() {
        driver.findElement(By.xpath(ContactPageLocators.NAME_INPUT_FIELD_XPATH)).click();
    }

    public void enterName() {
        driver.findElement(By.xpath(ContactPageLocators.NAME_INPUT_FIELD_XPATH)).sendKeys("Елена");
    }

    public void enterEmail() {
        driver.findElement(By.xpath(ContactPageLocators.EMAIL_INPUT_FIELD_XPATH)).sendKeys("test@test.com");
    }

    public void enterPhone() {
        driver.findElement(By.xpath(ContactPageLocators.PHONE_INPUT_FIELD_XPATH)).sendKeys("123456789");
    }

    public void clickNextBTN() {
        driver.findElement(By.xpath(ContactPageLocators.NEXT_BTN_XPATH)).click();
    }

    public String getEnteredContactsData() {
        return driver.findElement(By.xpath(ContactPageLocators.CONTACTS_DATA_XPATH)).getText();
    }

}
