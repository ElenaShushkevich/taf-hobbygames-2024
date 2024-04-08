package ui;

import by.hobbygames.pages.CheckoutPage;
import by.hobbygames.pages.HomePage;
import by.hobbygames.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckoutTest extends BaseTest {

    @Test
    @DisplayName("Checking item in the ordering")
    public void testCorrectItemInBasket() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        searchPage.clickAddToBasket();
        searchPage.clickBasketBTN();
        searchPage.navigateToBasket();
        CheckoutPage checkoutPage = new CheckoutPage();
        Assertions.assertEquals("Вампирский Манчкин", checkoutPage.getTitleOfOrder());
    }

}
