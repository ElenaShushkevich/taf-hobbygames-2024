package ui;

import by.hobbygames.pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckoutTest extends BaseTest {
    @Test
    @DisplayName("Checking that open checkout page")
    public void testOpenCheckoutPage() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        searchPage.clickAddToBasket();
        searchPage.clickBasketBTN();
        searchPage.navigateToBasket();
        CheckoutPage checkoutPage = new CheckoutPage();
        Assertions.assertEquals("Оформление заказа", checkoutPage.getCheckoutTitle());

    }

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
        checkoutPage.clickNextBTNAtCheckoutPage();
        Assertions.assertEquals("Способ получения", checkoutPage.getDeliveryHeader());
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
        checkoutPage.clickNextBTNAtCheckoutPage();
        checkoutPage.clickNextButtonAtDeliveryPart();
        Assertions.assertEquals("Выберите способ получения заказа", checkoutPage.getErrorMessageAtDeliveryPart());
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
        checkoutPage.clickNextBTNAtCheckoutPage();
        checkoutPage.clickRadioButtonPickUpFromStores();
        checkoutPage.clickNextButtonAtDeliveryPart();
        Assertions.assertEquals("Выберите способ доставки", checkoutPage.getErrorMessageWithoutStoresDeliveryPart());
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
        checkoutPage.clickNextBTNAtCheckoutPage();
        checkoutPage.clickRadioButtonPickUpFromStores();
        checkoutPage.clickSelectFromStoresList();
        checkoutPage.clickSelectPalazzoStore();
        Assertions.assertEquals("Минск, ТРЦ Palazzo\n" +
                "Республика Беларусь, г. Минск, ул. Тимирязева, д. 74а, ТРЦ Palazzo\n" + "10:00 – 22:00 Без перерывов и выходных", checkoutPage.getAddedStoreName());
    }
    @Test
    @DisplayName("Check added contacts data")
    public void testAddedContactsData() {

        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        searchPage.clickAddToBasket();
        searchPage.clickBasketBTN();
        searchPage.navigateToBasket();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickNextBTNAtCheckoutPage();
        checkoutPage.clickRadioButtonPickUpFromStores();
        checkoutPage.clickSelectFromStoresList();
        checkoutPage.clickSelectPalazzoStore();
        checkoutPage.clickNextButtonAtDeliveryPart();
        checkoutPage.enterName();
        checkoutPage.enterEmail();
        checkoutPage.enterPhone();
        checkoutPage.clickNextBTNForContact();
        Assertions.assertEquals("Елена\n" +
                "+375-(45)-375-23-75\n" +
                "test@test.com", checkoutPage.getEnteredContactsData());
    }
    @Test
    @DisplayName("Check payment method")
    public void testPaymentMethod() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        searchPage.clickAddToBasket();
        searchPage.clickBasketBTN();
        searchPage.navigateToBasket();
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickNextBTNAtCheckoutPage();
        checkoutPage.clickRadioButtonPickUpFromStores();
        checkoutPage.clickSelectFromStoresList();
        checkoutPage.clickSelectPalazzoStore();
        checkoutPage.clickNextButtonAtDeliveryPart();
        checkoutPage.enterName();
        checkoutPage.enterEmail();
        checkoutPage.enterPhone();
        checkoutPage.clickNextBTNForContact();
        Assertions.assertEquals("Оплата при получении заказа", checkoutPage.getMethodPayment());
    }
}
