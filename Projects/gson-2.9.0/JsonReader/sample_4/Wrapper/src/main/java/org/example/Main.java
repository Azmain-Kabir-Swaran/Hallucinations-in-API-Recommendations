package org.example;


import com.google.gson.stream.JsonReader;
import com.google.a.b.c.e.f.G;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            JsonReader reader = new JsonReader(new FileReader("path_to_your_file.json"));
            G g = new G(); // Here is where you can use other classes from other APIs but not new dependencies
            
            // Read and print JSON value
            reader.beginArray();
            while (reader.hasNext()) {
                System.out.println(reader.nextString());
            }
            reader.endArray();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}