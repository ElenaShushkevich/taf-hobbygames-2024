package ui;

import by.hobbygames.pages.CheckoutPage;
import by.hobbygames.pages.DeliveryPage;
import by.hobbygames.pages.HomePage;
import by.hobbygames.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeliveryTest extends BaseTest {
    @Test
    @DisplayName("Check that added delivery option")
    public void testOpenDeliveryPart() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        searchPage.clickAddToBasket();
        searchPage.clickBasketBTN();
        searchPage.navigateToBasket();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickNextBTNAtCheckuotPage();
        DeliveryPage deliveryPage = new DeliveryPage();
        Assertions.assertEquals("Способ получения", deliveryPage.getDeliveryHeader());
    }
}
