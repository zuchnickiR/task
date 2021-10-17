package pl.infoshare.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getOutputUserString(String message) {
        boolean invalid = false;
        String result = "";
        do{
            try {
                System.out.println(message);
                result = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input.");
                invalid = true;
            }
        }while (invalid);
        return result;
    }

    public static Double getOutputUserDouble() {
        Double result = scanner.nextDouble();
        return result;
    }

    public static Integer getOutputUserInteger() {
        Integer result = scanner.nextInt();
        return result;
    }

}
