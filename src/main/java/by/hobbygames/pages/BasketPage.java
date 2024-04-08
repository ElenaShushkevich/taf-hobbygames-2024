package by.hobbygames.pages;

import by.hobbygames.driver.Driver;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    WebDriver driver;

    public BasketPage() {
        this.driver = Driver.getDriver();
    }

}
