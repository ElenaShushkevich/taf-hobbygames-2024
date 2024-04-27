package api;

import by.hobbygames.api.ErrorsFromService;
import by.hobbygames.api.LoginService;
import by.hobbygames.api.Response;
import by.hobbygames.api.ResponseFields;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    @Test
    @DisplayName("Status code for Login w/o phone/email and w/o password")
    public void testWithoutPhoneAndPassword() {
        given().
                headers(LoginService.getHeaders()).
                body(LoginService.putBody("", "")).
                when().
                post(LoginService.LOGIN_URL).
                then().statusCode(200).
                body(ResponseFields.ERRORS_PHONE, equalTo(ErrorsFromService.ERRORS_WITH_EMPTY_PHONE)).and().
                body(ResponseFields.ERRORS_PASSWORD, equalTo(ErrorsFromService.ERROR_WITH_EMPTY_PASSWORD)).and().
                body(ResponseFields.ERRORS_LOGIN, equalTo(ErrorsFromService.ERRORS_WITH_EMPTY_PHONE_EMAIL));
    }

    @Test
    @DisplayName("Status code and message for invalid phone/email")
    public void testMessageInvalidPhone() {
        ValidatableResponse validatableResponse = given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                body(LoginService.putBody("12345674777", "")).
                when().
                post(LoginService.LOGIN_URL).
                then();
        Response response = validatableResponse.extract().as(Response.class);
        Assertions.assertEquals(ErrorsFromService.ERRORS_WITH_UNREGISTER_PHONE, response.getErrors().getPhone());
        Assertions.assertEquals(ErrorsFromService.ERROR_WITH_EMPTY_PASSWORD, response.getErrors().getPassword());
        Assertions.assertEquals(ErrorsFromService.ERROR_INVALID_EMAIL, response.getErrors().getLogin());
    }

    @Test
    @DisplayName("200 Status code")
    public void testInvalidEmail() {
        given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                body(LoginService.putBody("+3754412345678", "12345678")).
                when().
                post(LoginService.LOGIN_URL).
                then().statusCode(200);
    }
}
