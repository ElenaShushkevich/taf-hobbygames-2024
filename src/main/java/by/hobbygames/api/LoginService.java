package by.hobbygames.api;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
    public static final String LOGIN_URL = "https://hobbygames.by/?route=account/login/modalAjax";
    //public static final String ERROR_WITHOUt_ANY_DATA = "{"success":false,"errors":{"phone":"\u0414\u0430\u043d\u043d\u044b\u0435 \u043d\u0435 \u0432\u0432\u0435\u0434\u0435\u043d\u044b","password":"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043f\u0430\u0440\u043e\u043b\u044c","login":"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0442\u0435\u043b\u0435\u0444\u043e\u043d \u0438\u043b\u0438 \u044d\u043b\u0435\u043a\u0442\u0440\u043e\u043d\u043d\u0443\u044e \u043f\u043e\u0447\u0442\u0443"},"selected_region_id":15}";
//    public static final String ERROR_WITH_INVALID_PHONE = "{\n" +
//            "    \"success\": false,\n" +
//            "    \"errors\": {\n" +
//            "        \"phone\": \"Данные не введены\",\n" +
//            "        \"password\": \"Введите пароль\",\n" +
//            "        \"login\": \"Введите телефон или электронную почту\"\n" +
//            "    },\n" +
//            "    \"selected_region_id\": 15\n" +
//            "}";

    public static String putBody(String email, String password, String scenario) {
        return String.format("{\"login=\" + login + \" &password=\" + pass + \"&scenario=email\"}"
                , email, password, scenario);
    }

    public static String putBody(String email, String password) {
//        String body = "login=" + email + " &password=" + password + "&scenario=email";
//        return body;

        return String.format("login=%s&password=%s&scenario=email"
                , email, password);
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        return headers;
    }
    public static String getErrorWithInvalidPhone() {
        return String.format("{\n" +
                "    \"success\": false,\n" +
                "    \"errors\": {\n" +
                "        \"phone\": \"Данные не введены\",\n" +
                "        \"password\": \"Введите пароль\",\n" +
                "        \"login\": \"Введите телефон или электронную почту\"\n" +
                "    },\n" +
                "    \"selected_region_id\": 15\n" +
                "}");
    }
}
