package ui;

import by.hobbygames.ui.pages.HomePage;
import by.hobbygames.ui.pages.LoginModal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Login w/o phone and password")
    public void testLoginWithoutPhoneAndPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginIcon();
        LoginModal loginModal = new LoginModal();
        loginModal.clickEnterButton();
        assertAll(
                () -> assertEquals("Введите телефон или электронную почту", loginModal.getPhoneOrEmailError()),
                () -> assertEquals("Введите пароль", loginModal.getPasswordError())
        );
    }

    @Test
    @DisplayName("Login with invalid phone/email and w/o password")
    public void testLoginWithInvalidPhoneEmptyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginIcon();
        LoginModal loginModal = new LoginModal();
        loginModal.enterPhoneOrEmail(123456789);
        loginModal.clickEnterButton();
        assertAll(
                () -> assertEquals("Введённые данные некорректны", loginModal.getPhoneOrEmailError()),
                () -> assertEquals("Введите пароль", loginModal.getPasswordError())
        );
    }

    @Test
    @DisplayName("Login with empty phone/email and  password")
    public void testLoginWithEmptyPhonePassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginIcon();
        LoginModal loginModal = new LoginModal();
        loginModal.enterPassword("123456789");
        loginModal.clickEnterButton();
        assertAll(
                () -> assertEquals("Введите телефон или электронную почту", loginModal.getPhoneOrEmailError()),
                () -> assertEquals("Неверный пароль", loginModal.getPasswordError())
        );
    }
    @Test
    @DisplayName("Login with invalid phone/email and w/o password")
    public void testLoginWithInvalidEmailEmptyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginIcon();
        LoginModal loginModal = new LoginModal();
        loginModal.enterPhoneOrEmail("test@mail");
        loginModal.clickEnterButton();
        assertAll(
                () -> assertEquals("Введённые данные некорректны", loginModal.getPhoneOrEmailError()),
                () -> assertEquals("Введите пароль", loginModal.getPasswordError())
        );
    }
}
