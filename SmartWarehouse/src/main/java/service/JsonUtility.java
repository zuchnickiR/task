package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtility {
    //https://www.youtube.com/watch?v=Bq7WBXd6gEg&ab_channel=JavaHangout
    //Converting Object into JSON String & JSON String into Object by using Jackson API


    //mapowanie na Stringa z obiektu
    public static String toJsonString(Object ob) {
        String jsonToString = "";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            jsonToString = objectMapper.writeValueAsString(ob);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonToString;
    }


    public static <I> I toObject(String jsonString, Class<I> cls) {
        I result = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            result = objectMapper.readValue(jsonString, cls);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;    }

    public JsonUtility() {
    }


}
