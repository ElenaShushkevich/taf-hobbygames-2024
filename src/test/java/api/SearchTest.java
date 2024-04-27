package api;

import by.hobbygames.api.SearchService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class SearchTest {
    @Test
    @DisplayName("Search 'Манчкин' game")
    public void testSearchGame() {
        given().
                queryParams(SearchService.getQueryParams()).
                when().
                get(SearchService.SEARCH_URL).
                then().statusCode(200);
    }
}
