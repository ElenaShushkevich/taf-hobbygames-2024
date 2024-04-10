package ui;

import by.hobbygames.pages.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactTest extends BaseTest {
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
        Assertions.assertEquals("Елена\n" +
                "+375-(45)-375-23-75\n" +
                "test@test.com",contactPage.getEnteredContactsData());
    }
}
