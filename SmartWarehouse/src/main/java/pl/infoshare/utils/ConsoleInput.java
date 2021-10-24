package pl.infoshare.utils;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ConsoleInput {

    public static String getInputUserString() {
        boolean valid = false;
        String result = "";
        do{
            try {
                result = new Scanner(System.in).nextLine();
                if(result.isEmpty() && result.isBlank()){
                    valid = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input.");
                valid = true;
            }
        }while (valid);
        return result;
    }

    public static Double getInputUserDouble() {
        boolean valid = false;
         double result = 0;
        do{
            try {
                result = new Scanner(System.in).nextDouble();
                System.out.println("result = " + result);

            } catch (InputMismatchException e) {
                System.out.println("Wrong input.");
                valid = true;
            }
        }while (valid);
        return result;
    }

  public static Integer getInputUserInteger() {
        boolean valid = false;
        int result = 0;
       do{
          try {

              result = new Scanner(System.in).nextInt();

           } catch (InputMismatchException e) {
               System.out.println("Wrong input.");
                valid = true;
          }
       } while (valid);
       return result;
    }

}
