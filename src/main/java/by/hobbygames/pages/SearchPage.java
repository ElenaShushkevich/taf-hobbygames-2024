package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import by.hobbygames.locators.SearchPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchPage {

    WebDriver driver;

    public SearchPage() {
        this.driver = Driver.getDriver();
    }

    public String getNameofTheGame() {
        return driver.findElement(By.xpath(SearchPageLocators.VAMPIRSKIJ_MANCHKIN_XPATH)).getText();
    }

    public String getResults() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SearchPageLocators.VAMPIRSKIJ_MANCHKIN_XPATH)));
        return driver.findElement(By.xpath(SearchPageLocators.RESULTS_OF_SEARCH_XPATH)).getText();
    }

    public void clickAddToBasket() {
        driver.findElement(By.xpath(SearchPageLocators.ADD_TO_BASKET_BTN_XPATH)).click();
    }

    public void clickBasketBTN() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SearchPageLocators.VAMPIRSKIJ_MANCHKIN_XPATH)));
        driver.findElement(By.xpath(SearchPageLocators.BASKET_BTN_XPATH)).click();
    }

    public void navigateToBasket() {
        driver.findElement(By.xpath(SearchPageLocators.REGISTRATION_OF_THE_ORDER_BTN_XPATH)).click();
    }

    public int getNumbersOfItemsAtTheResultPage() {
        List<WebElement> numbersOfItems = driver.findElements(By.xpath(SearchPageLocators.ITEMS_XPATH));
        return numbersOfItems.size();
    }
}
