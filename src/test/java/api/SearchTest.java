package api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class SearchTest {
    @Test
    @DisplayName("Search 'vfyxrby' game")
    public void testSearchGame(){
        given().
                when().
                get("https://hobbygames.by/catalog/search?keyword=vfyxrby").
                then().statusCode(200);
    }
}
