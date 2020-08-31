package json.app;

import java.util.ArrayList;

import com.google.gson.Gson;

import json.beans.UserData;
import json.utils.JsonUtils;

public class App {

    private static final String IMPLICIT_JSON = "{\"userId\": 1, \"id\": 1, \"title\": \"this is the title\", \"body\": \"this is the body\" }";

    private static final String JSON_USER = "json_inputs/user.txt";
    private static final String JSON_USERS = "json_inputs/users.txt";

    public static void main(String[] args) {

        System.out.println("=================================================================");
        System.out.println("    Example 1: JSON to Java Conversion with implicit Json String");
        System.out.println("=================================================================");

        System.out.println("----- JSON -----\n\n" + IMPLICIT_JSON);
        UserData uData1 = JsonUtils.convertImplicitJSONToJavaObject(IMPLICIT_JSON);
        System.out.println("\n------ Java Object ------\n\n" + uData1);

        System.out.println("=================================================================");
        System.out.println("    Example 2: JSON to Java Conversion with implicit Json String");
        System.out.println("=================================================================");

        System.out.println("----- JSON -----\n\n" + IMPLICIT_JSON);
        UserData uData2 = JsonUtils.convertJsonFileDataToJavaObject(JSON_USER);
        System.out.println("\n------ Java Object ------\n\n" + uData2);

        System.out.println("=================================================================");
        System.out.println("    Example 3: JSON to Java Conversion with implicit Json String");
        System.out.println("=================================================================");

        System.out.println("----- JSON -----\n\n" + IMPLICIT_JSON);
        ArrayList<UserData> uData3 = JsonUtils.convertJsonArrayFileDataToJavaObject(JSON_USERS);
        for (UserData data : uData3) {
            System.out.println(data);
        }

        System.out.println("=================================================================");
        System.out.println("    Example 4: JSON to Java Conversion with implicit Json String");
        System.out.println("=================================================================");

        System.out.println("----- JSON -----\n\n" + IMPLICIT_JSON);
        UserData uData4 = JsonUtils.convertImplicitJSONToJavaObject(IMPLICIT_JSON);
        System.out.println("\n------ Java Object ------\n\n" + uData4);
        String uJson = new Gson().toJson(uData4);
        System.out.println("\n--------- JSON --------\n" + uJson);
    }

}
