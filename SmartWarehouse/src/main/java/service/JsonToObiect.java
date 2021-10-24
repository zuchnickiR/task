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
//https://stackoverflow.com/questions/17712052/convert-json-string-to-generic-object-in-java-with-gson
//https://stackoverflow.com/questions/17712052/convert-json-string-to-generic-object-in-java-with-gson
//https://www.youtube.com/watch?v=Bq7WBXd6gEg&ab_channel=JavaHangout

    //TA METODA SPEŁNIA ZAŁOŻENIA TASKU
    public <I> I converteJsonFileToDomainObiect(Class<I> cls, String nazwaPliku) { //nazwęPlikuJson + validacja!!!
        System.out.println("Prosze wpisz nazwę pliku o rozszeżeniu JSON, który chcesz skonwertować do postaci Obiektu Java");
        String projectDirectory = PathsClasses.getProjecDirectory();
//        Scanner scanner = new Scanner(System.in);
//        String nazwa = scanner.nextLine();
        I result = null;
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(projectDirectory + nazwaPliku + ".json");

        ifJson(file);

        try {
         result = objectMapper.readValue(file,cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public void ifJson(File file){

        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY);
            JsonFactory factory = mapper.getFactory();
            JsonParser parser = factory.createParser(file);
            JsonNode jsonObj = mapper.readTree(parser);
            System.out.println("TO JEST JSON: " + jsonObj.toString());
        }
        catch(Exception ex){
            System.out.println("Not a valid Json String: " + ex.getMessage());
        }


    }


   private String getClassNameFromFileName(String s) {
        //do metody prześlemy Stringa z nazwą naszego pliku, w której na pierwszym miejsu widnieje
       String[] split = s.split(" ");
       String clasName = split[0];
     return clasName + ".class";
   }


   }
