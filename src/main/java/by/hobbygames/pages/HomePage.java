package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.HomePageLocators;
import org.openqa.selenium.By;

public class HomePage extends JSExecutor {
    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public String getLogoHeader() {
        waitJSLoad();
        return driver.findElement(By.xpath(HomePageLocators.LOGO_HEADER_XPATH)).getAttribute("src");
    }

    public void clickSearchField() {
        waitJSLoad();
        driver.findElement(By.xpath(HomePageLocators.SEARCH_INPUT_FIELD_XPATH)).click();
    }

    public void enterGameName() {
        waitJSLoad();
        driver.findElement(By.xpath(HomePageLocators.SEARCH_INPUT_FIELD_XPATH)).sendKeys("Манчкин");
    }

    public void clickSearchBtn() {
        waitJSLoad();

        driver.findElement(By.xpath(HomePageLocators.SEARCH_BTN_XPATH)).click();
    }

    public void clickLoginIcon() {
        waitJSLoad();
        driver.findElement(By.xpath(HomePageLocators.LOGIN_BTN_XPATH)).click();
    }
}
