package service;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;


public class JsonToObiect {

    public <I> I converteJsonFileToDomainObiect(Class<I> cls, String nazwaPliku) {
        String projectDirectory = PathsClasses.getProjecDirectory();
        I result = null;
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(projectDirectory + nazwaPliku + ".json");
       if(ifJson(file)) {
           try {
               result = objectMapper.readValue(file, cls);
           } catch (Exception e) {
           }
       } else {
           System.out.println("\nPlik o takiej nazwie nie istnieje w katalogu: " + projectDirectory +"\n" +
                   "---------------------------------------------------------------------------------------------\n" +
                   "a) Upewnij się, że podałeś prawidłową nazwę szukanego pliku\n" +
                   "b) Upewnij się, że podałeś samą nazwę pliku, bez podania rozszeżenia .json\n" +
                   "---------------------------------------------------------------------------------------------");
       }
        return result;
    }


    public boolean ifJson(File file) {
        boolean ifJson;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY);
            JsonFactory factory = mapper.getFactory();
            JsonParser parser = factory.createParser(file);
            JsonNode jsonObj = mapper.readTree(parser);
            System.out.println("TO JEST JSON: " + jsonObj.toString());
            ifJson = true;
        } catch (Exception ex) {
            ifJson = false;
        }
        return ifJson;
    }




}
