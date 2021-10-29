package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.infoshare.model.User;

public class MAinTest {

    public static void main(String[] args) {


        PersonTest personTest = new PersonTest("Rob001", 123456.998, 886);
        PersonTest personTest1 = new PersonTest("Alex", 45123456.998, 989);
        PersonTest personTest2 = new PersonTest("ROBOT", 111.222, 500);


        ObiectToJson obiectToJson = new ObiectToJson();
        obiectToJson.createJSONObject(personTest1, "/home/rob/Desktop/YellowAngels1/SmartWarehouse/");


        JsonToObiect jsonToObiect = new JsonToObiect();
        PersonTest personTest3 = jsonToObiect.converteJsonFileToDomainObiect(PersonTest.class, "/home/rob/Desktop/YellowAngels1/SmartWarehouse/", "19:50:39");
        System.out.println(personTest3.getName());

    }

}
