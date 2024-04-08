package ui;

import by.hobbygames.pages.HomePage;
import by.hobbygames.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    @Test
    @DisplayName("Open results page")
    public void testOpenResultPage() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        Assertions.assertEquals("Результаты поиска", searchPage.getResults());
    }

    @Test
    @DisplayName("Check Logo at the HomePage")
    public void testSearchManchkinGame() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        Assertions.assertEquals("", homePage.getLogoHeader());
    }
}
