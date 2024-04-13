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

    @Test
    @DisplayName("Check error message before any action at the delivery part")
    public void testMethodReceivingOrderErrorMessage() {
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
        deliveryPage.clickNextButton();
        Assertions.assertEquals("Выберите способ получения заказа", deliveryPage.getErrorMessage());
    }

    @Test
    @DisplayName("Check error message without stores")
    public void testSelectStoresErrorMessage() {
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
        deliveryPage.clickRadioButtonPickUpFromStores();
        deliveryPage.clickNextButton();
        Assertions.assertEquals("Выберите способ доставки", deliveryPage.getErrorMessageWithoutStores());
    }

    @Test
    @DisplayName("Check store name at the delivery part")
    public void testStoreName() {
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
        deliveryPage.clickRadioButtonPickUpFromStores();
        deliveryPage.clickSelectFromList();
        deliveryPage.clickSelectPalazzoStore();
        Assertions.assertEquals("Минск, ТРЦ Palazzo ?\n" +
                "Доставка с центрального склада\n" +
                "Республика Беларусь, г. Минск, ул. Тимирязева, д. 74а, ТРЦ Palazzo\n" +
                "10:00 – 22:00 Без перерывов и выходных", deliveryPage.getAddedStoreName());
    }
}
