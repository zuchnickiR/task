package service;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ObiectToJson {

    public void createJSONObjectOK(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        String projecDirectory = PathsClasses.getProjecDirectory();
        String simpleName = object.getClass().getSimpleName();
        String fileName = simpleName + " " + DataTime.getCurrentDate() + " " + DataTime.getCurrentTime();
        String fileType = objectMapper.getClass().getSimpleName();
        System.out.println("--------------------------------\n" +
                "Do you want to save file?\n" +
                "Name: " + fileName + "\n" +
                "Type: " + simpleName + "\n" +
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
}
