package api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginTest {
    @Test
    @DisplayName("Status code for Login w/o phone/email and w/o password")
    public void testWithoutPhoneAndPassword() {
        String body = "login=&password=&scenario=email";
        given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                body(body).
                when().
                post("https://hobbygames.by/?route=account/login/modalAjax").
                then().statusCode(200);
    }

    @Test
    @DisplayName("Status code and message for Login w/o phone/email and w/o password")
    public void testMessageWithoutPhoneAndPassword() {
        String body = "login=&password=&scenario=email";
        String errorWithoutAnyDate = "{\"success\":false,\"errors\":{\"phone\":\"\\u0414\\u0430\\u043d\\u043d\\u044b\\u0435 \\u043d\\u0435 \\u0432\\u0432\\u0435\\u0434\\u0435\\u043d\\u044b\",\"password\":\"\\u0412\\u0432\\u0435\\u0434\\u0438\\u0442\\u0435 \\u043f\\u0430\\u0440\\u043e\\u043b\\u044c\",\"login\":\"\\u0412\\u0432\\u0435\\u0434\\u0438\\u0442\\u0435 \\u0442\\u0435\\u043b\\u0435\\u0444\\u043e\\u043d \\u0438\\u043b\\u0438 \\u044d\\u043b\\u0435\\u043a\\u0442\\u0440\\u043e\\u043d\\u043d\\u0443\\u044e \\u043f\\u043e\\u0447\\u0442\\u0443\"},\"selected_region_id\":15}";
        given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                body(body).
                when().
                post("https://hobbygames.by/?route=account/login/modalAjax").
                then().statusCode(200).
                body(equalTo(errorWithoutAnyDate));
    }

    @Test
    @DisplayName("Status code and message for invalid phone/email")
    public void testMessageInvalidPhone() {
        String body = "login=1233323121&password=&scenario=email";
        String errorWithInvalidPhone = "{\"success\":false,\"errors\":{\"phone\":\"\\u0422\\u0430\\u043a\\u043e\\u0439 \\u0442\\u0435\\u043b\\u0435\\u0444\\u043e\\u043d \\u043d\\u0435 \\u0437\\u0430\\u0440\\u0435\\u0433\\u0438\\u0441\\u0442\\u0440\\u0438\\u0440\\u043e\\u0432\\u0430\\u043d\",\"password\":\"\\u0412\\u0432\\u0435\\u0434\\u0438\\u0442\\u0435 \\u043f\\u0430\\u0440\\u043e\\u043b\\u044c\",\"login\":\"\\u041d\\u0435\\u0432\\u0435\\u0440\\u043d\\u044b\\u0439 \\u0442\\u0435\\u043b\\u0435\\u0444\\u043e\\u043d\\/e-mail\"},\"selected_region_id\":15}";
        given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                body(body).
                when().
                post("https://hobbygames.by/?route=account/login/modalAjax").
                then().statusCode(200).
                body(equalTo(errorWithInvalidPhone));
    }
}
