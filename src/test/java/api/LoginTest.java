package api;

import by.hobbygames.api.LoginService;
import by.hobbygames.api.ResponseFields;
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
        String body = "login=&password=&scenario=email";
        given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                body(body).
                when().
                post(LoginService.LOGIN_URL).
                then().statusCode(200);

    }

//    @Test
//    @DisplayName("Status code and message for Login w/o phone/email and w/o password")
//    public void testMessageWithoutPhoneAndPassword() {
//        String body = "login=&password=&scenario=email";
//               given().
//                headers(LoginService.getHeaders()).
//                body(LoginService.putBody("","")).
//                when().
//                post(LoginService.LOGIN_URL).
//                then().statusCode(200).
//               // body(equalTo(LoginService.ERROR_WITHOUt_ANY_DATA));
//    }

    @Test
    @DisplayName("Status code and message for invalid phone/email")
    public void testMessageInvalidPhone() {
        given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                body(LoginService.putBody("12345674777","")).
                when().
                post(LoginService.LOGIN_URL).
                then().statusCode(200).
                body(ResponseFields.ERRORS_PHONE, equalTo("Такой телефон не зарегистрирован")).
                body(ResponseFields.ERRORS_PASSWORD, equalTo("Введите пароль")).
                body(ResponseFields.ERRORS_LOGIN, equalTo("Неверный телефон/e-mail"));
    }

    @Test
    @DisplayName("200 Status code")
    public void testInvalidEmail() {
        String body = "login=%40test%40&password=&scenario=email";
        given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                body(body).
                when().
                post(LoginService.LOGIN_URL).
                then().statusCode(200);
    }
}
