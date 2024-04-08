package ui;

import by.hobbygames.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    @DisplayName("Check item at Home Page")
    public void testHomePageOpen() {
        HomePage homePage = new HomePage();
        Assertions.assertEquals("https://hobbygames.by/assets/img/svg/logo.svg", homePage.getLogoHeader());
    }
}
