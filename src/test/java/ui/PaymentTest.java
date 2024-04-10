package ui;

import by.hobbygames.pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PaymentTest extends BaseTest{
    @Test
    @DisplayName("Check payment method")
    public void testPaymentMethod(){
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
        deliveryPage.clickNextButton();
        ContactPage contactPage = new ContactPage();
        contactPage.enterName();
        contactPage.enterEmail();
        contactPage.enterPhone();
        contactPage.clickNextBTN();
        PaymentPage paymentPage = new PaymentPage();
        Assertions.assertEquals("Оплата при получении заказа",paymentPage.getMethodPayment());
    }
}
