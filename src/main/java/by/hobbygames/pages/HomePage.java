package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.HomePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public String getLogoHeader() {
        return driver.findElement(By.xpath(HomePageLocators.LOGO_HEADER_XPATH)).getAttribute("src");
    }

    public void clickSearchField() {
        driver.findElement(By.xpath(HomePageLocators.SEARCH_INPUT_FIELD_XPATH)).click();
    }

    public void enterGameName() {
        driver.findElement(By.xpath(HomePageLocators.SEARCH_INPUT_FIELD_XPATH)).sendKeys("Манчкин");
    }

    public void clickSearchBtn() {
        driver.findElement(By.xpath(HomePageLocators.SEARCH_BTN_XPATH)).click();
    }

    public void clickLoginIcon() {
        driver.findElement(By.xpath(HomePageLocators.LOGIN_BTN_XPATH)).click();
    }
}
