package by.hobbygames.api;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
    public static final String LOGIN_URL = "https://hobbygames.by/?route=account/login/modalAjax";

    public static String putBody(String email, String password) {
        return String.format("login=%s&password=%s&scenario=email"
                , email, password);
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        return headers;
    }
}
