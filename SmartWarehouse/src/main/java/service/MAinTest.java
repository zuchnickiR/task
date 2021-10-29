package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.infoshare.model.User;

public class MAinTest {

    public static void main(String[] args) {


        PersonTest personTest = new PersonTest("Rob001", 123456.998, 886);
        PersonTest personTest1 = new PersonTest("Rob002", 45123456.998, 989);
        PersonTest personTest2 = new PersonTest("ROBOT", 111.222, 500);

        //MAPUJE POJO NA JSON'A
        ObiectToJson obiectToJson = new ObiectToJson();
      //  obiectToJson.createJSONObjectOK111(personTest2, "/home/rob/Desktop/YellowAngels1/SmartWarehouse/");

        //MAPUJĘ PLIK JSON NA POJO (+ WALIDACJA 'czy .json' PODCZAS INPUTU)
        JsonToObiect jsonToObiect = new JsonToObiect();
        PersonTest personTest3 = jsonToObiect.converteJsonFileToDomainObiect111(PersonTest.class, "/home/rob/Desktop/YellowAngels1/SmartWarehouse/", "14:21:17");
        String name = personTest3.getName();
        System.out.println(name);


//  /home/rob/Desktop/YellowAngels1/SmartWarehouse/19:10:36.json

    }

}

//file name skopiowany bezposrednio z targetu:
//   PersonTest 2021-10-23 10:51:37.json