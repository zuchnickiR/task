package service;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ObiectToJson {

//TA METODA SPEŁNIA ZAŁOŻENIA TASKU
    public void createJSONObjectOK(Object object) {
        /*
        Jackson API dostarczan nam ObjectMapper by skonwertować Java Object into JSON and JSON into Java Object

         */


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
                String valueAsString = objectMapper.writeValueAsString(object);
                objectMapper.writeValue(
                        new FileWriter(projecDirectory + simpleName + " " + DataTime.getCurrentDate() + " " + DataTime.getCurrentTime() + " .json"), valueAsString);
                System.out.println("CREATE FILE: '" + fileName + "' IN PATH: " + projecDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Saving file aborted.");
        }
    }
}
