package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.infoshare.model.User;

public class MAinTest {

    public static void main(String[] args) {


        PersonTest personTest = new PersonTest("Rob001", 123456.998, 886);
        PersonTest personTest1 = new PersonTest("Rob002", 45123456.998, 989);
        PersonTest personTest2 = new PersonTest("Rob003", 87124653456.998, 4558);

        //MAPUJE POJO NA JSON'A
//        ObiectToJson obiectToJson = new ObiectToJson();
//        obiectToJson.createJSONObjectOK(personTest2);

        //MAPUJĘ PLIK JSON NA POJO (+ WALIDACJA 'czy .json' PODCZAS INPUTU)
        JsonToObiect jsonToObiect = new JsonToObiect();
        PersonTest personTest3 = jsonToObiect.converteJsonFileToDomainObiect(PersonTest.class, "18:54:22");
        String name = personTest3.getName();
        System.out.println(name);


    }

}

//file name skopiowany bezposrednio z targetu:
//   PersonTest 2021-10-23 10:51:37.json