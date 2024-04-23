package org.example;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {
        
        try{
            throw new JsonParseException("Example JSON parse exception");
        }
        catch(JsonParseException e) {
            System.out.println("JsonParseException: "+e.getMessage());
        }
        
        ObjectMapper mapper = new ObjectMapper(); 
        
        try {
            throw new JsonMappingException("Example JSON mapping exception");
        } catch (JsonMappingException e) {
            System.out.println("JsonMappingException: "+e.getMessage());
        }
        
    }

}