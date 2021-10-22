package service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MAinTest {

    public static void main(String[] args) {


        PersonTest personTest = new PersonTest("Rob001", 123456.998, 886);

        String ooo = ooo(personTest);
        System.out.println(ooo);


    }


    public static String ooo (Object object) {


        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(object);
            return s;


        } catch (Exception ex) {


        }

return null;
    }

}

