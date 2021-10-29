package service;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ObiectToJson {

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
// METODA PIERWOTNA OK, JEDNAK WYMAGA ODCHUDZENIA
    public void createJSONObjectOK(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        String projecDirectory = PathsClasses.getProjecDirectory();
        String simpleClassName = object.getClass().getSimpleName();
        String fileName = DataTime.getCurrentTime();
        System.out.println("--------------------------------\n" +
                "Do you want to save file?\n" +
                "Name: " + fileName + "\n" +
                "Type: " + simpleClassName + "\n" +
                "--------------------------------\n" +
                "a) If yes enter 'y', then press enter\n" +
                "b) If no enter any keyboard key, then press enter");
        Scanner scanner = new Scanner(System.in);
        String resultYn = scanner.nextLine();
        if (resultYn.equals("Y") || resultYn.equals("y")) {
            try {
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(
                        new FileWriter(projecDirectory
                                + DataTime.getCurrentTime() + // Nazwą pliku będzie jak na razie czas zapisu, by generować "unikalne" nazwy
                                ".json"), object);
                System.out.println("CREATE FILE: '" + DataTime.getCurrentTime() + "' IN PATH: " + projecDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Saving file aborted.");
        }
    }
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------


    public void createJSONObjectOK111(Object object, String projecDirectory) {
        ObjectMapper objectMapper = new ObjectMapper();
        String simpleClassName = object.getClass().getSimpleName();
        String fileName = DataTime.getCurrentTime();
     if(ifSaveFile(fileName,simpleClassName)) {
         try {
             objectMapper.writerWithDefaultPrettyPrinter().writeValue(
                     new FileWriter(projecDirectory
                             + DataTime.getCurrentTime() +
                             ".json"), object);
             System.out.println("CREATE FILE: '" + DataTime.getCurrentTime() + "' IN PATH: " + projecDirectory);
         } catch (IOException e) {
             e.printStackTrace();
         }
     } else {
         System.out.println("Saving file aborted.");
     }
    }

//czy zapisać plik bedzie zwracac boolean true jesli chce zapisac plik
    public boolean ifSaveFile(String fileName, String simpleClassName) {
        boolean result = false;
        System.out.println("--------------------------------\n" +
                "Do you want to save file?\n" +
                "Name: " + fileName + "\n" +
                "Type: " + simpleClassName + "\n" +
                "--------------------------------\n" +
                "a) If yes enter 'y', then press enter\n" +
                "b) If no enter any keyboard key, then press enter");
        Scanner scanner = new Scanner(System.in);
        String resultYn = scanner.nextLine();
        if(resultYn.equals("Y") || resultYn.equals("y")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}



