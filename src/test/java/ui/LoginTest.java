package ui;

import by.hobbygames.pages.HomePage;
import by.hobbygames.pages.LoginModal;
import org.junit.jupiter.api.Assertions;
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
    @DisplayName("Login with invalid email and  password")
    public void testLoginWithInvalidPhoneAndPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginIcon();
        LoginModal loginModal = new LoginModal();
        loginModal.enterPhoneOrEmail("@test/");
        loginModal.enterPassword("123456789");
        loginModal.clickEnterButton();
        assertAll(
                () -> assertEquals("Введённые данные некорректны", loginModal.getPhoneOrEmailError()),
                () -> assertEquals("Неверный пароль", loginModal.getPasswordError())
        );
    }

    @Test
    @DisplayName("Login with non-existent email and  password")
    public void testLoginWithNonExistentPhoneAndPassword() {
        HomePage homePage = new HomePage();
        homePage.clickLoginIcon();
        LoginModal loginModal = new LoginModal();
        loginModal.enterPhoneOrEmail("test@test.com");
        loginModal.enterPassword("123456789");
        loginModal.clickEnterButton();
        assertAll(
                () -> assertEquals("Введённые данные некорректны", loginModal.getPhoneOrEmailError()),
                () -> assertEquals("Неверный пароль", loginModal.getPasswordError())
        );
    }
}
