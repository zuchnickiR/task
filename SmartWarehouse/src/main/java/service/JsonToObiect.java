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
           System.out.println("\nA file with this name does not exist in the directory:: " + projectDirectory +"\n" +
                   "---------------------------------------------------------------------------------------------\n" +
                   "a) Make sure you entered the correct name of the file you are looking for\n" +
                   "b) Make sure you have entered the file name only, without any .json extension\n" +
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

            System.out.println("File correctness check: passed");
            ifJson = true;
        } catch (Exception ex) {
            ifJson = false;
        }
        return ifJson;
    }







}
