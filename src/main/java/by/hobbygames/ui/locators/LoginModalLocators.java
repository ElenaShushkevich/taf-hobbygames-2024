package by.hobbygames.ui.locators;

public class LoginModalLocators {
    public static final String INPUT_EMAIL_OR_PHONE_FIELD_XPATH ="//input[@name='login']";
    public static final String INPUT_PASSWORD_FIELD_XPATH ="//input[@name='password']";
    public static final String ERROR_FOR_EMAIL_FIELD_XPATH = "//label[@data-scenario='login']//div[@class='error']";
    public static final String ERROR_FOR_PASSWORD_FIELD_XPATH ="//label[@class='password-group']//div[@class='error']";
    public static final String SUBMIT_BTH_XPATH ="//input[@type='submit']";
}
