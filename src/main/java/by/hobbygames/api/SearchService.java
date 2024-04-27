package by.hobbygames.api;

import java.util.HashMap;
import java.util.Map;

public class SearchService {
    public static final String SEARCH_URL = "https://hobbygames.by/catalog/search";

    public static Map<String, String> getQueryParams() {
        Map<String, String> result = new HashMap<>();
        result.put("query", "манчкин");
        return result;
    }
}
