package json.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.beans.UserData;

public class JsonUtils {

    /**
     * Converts implicit JSON string to Java Object.
     * 
     * @param jsonInput
     * @return
     */
    public static UserData convertImplicitJSONToJavaObject(String jsonInput) {

        UserData uData = null;
        ObjectMapper mapper = new ObjectMapper();

        try {
            uData = mapper.readValue(jsonInput, UserData.class);
        } catch (JsonParseException e) {
            System.out.println(e);
        } catch (JsonMappingException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return uData;
    }

    public static UserData convertJsonFileDataToJavaObject(String inputFile) {
        UserData uData = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            uData = mapper.readValue(new File(ClassLoader.getSystemClassLoader().getResource(inputFile).getFile()),
                    UserData.class);
        } catch (JsonParseException e) {
            System.out.println(e);
        } catch (JsonMappingException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return uData;
    }

    /**
     * Reads a resource file in which JSON string is present and converts this to
     * Java Object.
     * 
     * @param inputFile
     * @return
     */
    public static ArrayList<UserData> convertJsonArrayFileDataToJavaObject(String inputFile) {
        ArrayList<UserData> uDataList = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            uDataList = mapper.readValue(new File(ClassLoader.getSystemClassLoader().getResource(inputFile).getFile()),
                    new TypeReference<ArrayList<UserData>>() {
                    });
        } catch (JsonParseException e) {
            System.out.println(e);
        } catch (JsonMappingException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return uDataList;
    }

}
