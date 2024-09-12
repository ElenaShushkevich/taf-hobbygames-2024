package by.hobbygames.ui.locators;

public class CheckoutPageLocators {
    public static final String CHECKOUT_TITLE_XPATH = "//h2";
    public static final String ITEM_IN_BASKET_XPATH = "//a[@href='https://hobbygames.by/vampirskij-manchkin']";
    public static final String NEXT_BTN = "//a[@data-visible=\"main\"]";
    public static final String NAME_INPUT_FIELD_XPATH = "//input[@id='contact-firstname']";
    public static final String EMAIL_INPUT_FIELD_XPATH = "//input[@id='contact-email']";
    public static final String PHONE_INPUT_FIELD_XPATH = "//input[@id='contact-phone']";
    public static final String CONTACT_NEXT_BTN_XPATH = "//a[@data-step='payment']";
    public static final String CONTACTS_DATA_XPATH = "//div[@class='col-sm-8']";
    public static final String DELIVERY_TITLE_XPATH = "//div[@class='col-md-5']";
    public static final String DELIVERY_ERROR_XPATH = "//span[@class ='error']";
    public static final String RADIO_BTN_PICKUP_FROM_STORES_XPATH = "//input[@id='pickup-0']";
    public static final String ERROR_MESSAGE_WITHOUT_STORES_XPATH = "//div[@class ='form-group has-error']//*[@class ='ui-field-error']";
    public static final String SELECT_FROM_LIST_BTN_XPATH = "//a[@class='btn blue show-method-list']";
    //public static final String PALAZZO_STORES_XPATH = "//p[contains(text(), 'Palazzo')]/following::div[3]";

    public static final String KORONA_CITY_STORES_XPATH = "//p[contains(text(), 'Корона-Сити')]/following::div[3]";
    public static final String ADDED_STORES_TO_DELIVERY = "//label[@class='top']";
    public static final String DELIVERY_NEXT_BTN_XPATH = "//a[@data-visible=\"delivery\"]";
    public static final String PAYMENT_METHOD_XPATH = "//span[text()='Оплата при получении заказа']";
}
