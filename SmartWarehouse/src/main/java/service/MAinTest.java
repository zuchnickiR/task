package service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MAinTest {

    public static void main(String[] args) {


        PersonTest personTest = new PersonTest("Rob001", 123456.998, 886);



        ObiectToJson obiectToJson = new ObiectToJson();
        obiectToJson.createJSONObjectOK(personTest);

        JsonToObiect jsonToObiect = new JsonToObiect();
        jsonToObiect.converteJsonFileToDomainObiect(PersonTest.class);




    }

}

//file name skopiowany bezposrednio z targetu:
//   PersonTest 2021-10-23 10:51:37.json