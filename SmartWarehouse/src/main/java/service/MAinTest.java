package service;

public class MAinTest {

    public static void main(String[] args) {

        PersonTest personTest = new PersonTest("AI", 222.500, 24);

        ObiectToJson obiectToJson = new ObiectToJson();
        obiectToJson.createJSONObjectOK(personTest);


//        String s = JsonUtility.toJsonString(personTest);
//        PersonTest personTest1 = JsonUtility.toObject(s, PersonTest.class);
//        System.out.println(personTest1.getPrice());


    }
}

