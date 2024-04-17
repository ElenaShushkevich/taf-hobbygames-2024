package ui;

import by.hobbygames.pages.HomePage;
import by.hobbygames.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    @Test
    @DisplayName("Open page with results")
    public void testOpenResultPage() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        Assertions.assertEquals("Результаты поиска", searchPage.getResults());
    }

    @Test
    @DisplayName("Checking selected item/game at page")
    public void testSearchManchkinGame() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        Assertions.assertEquals("Вампирский Манчкин", searchPage.getNameofTheGame());
    }

    @Test
    @DisplayName("Count product items")
    public void testCountItemsAtTheResultPage() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        Assertions.assertEquals(30, searchPage.getNumbersOfItemsAtTheResultPage());
    }

    @Test
    @DisplayName("Name of items")
    public void testItemsContainGameName() {
        HomePage homePage = new HomePage();
        homePage.clickSearchField();
        homePage.enterGameName();
        homePage.clickSearchBtn();
        SearchPage searchPage = new SearchPage();
        Assertions.assertTrue(searchPage.getNameOfItems().contains("Манчкин"));
    }
}
