package org.example;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.input.ReversedLinesFileReader;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws IOException {

        // Example usage of FileUtils.writeStringToFile() method
        File tempFile = File.createTempFile("test", ".txt");
        System.out.println("Temp File created : " + tempFile.getAbsolutePath());
        FileUtils.writeStringToFile(tempFile, "Hello World", "UTF-8", true);

        // Example usage of FileUtils.readLines() method
        Collection<String> lines = FileUtils.readLines(tempFile, "UTF-8");
        for (String line : lines) {
            System.out.println(line);
        }

        // Example usage of FileUtils.tail() method
        Collection<String> tailedLines = FileUtils.tail(tempFile, 1, "UTF-8", true);
        for (String line : tailedLines) {
            System.out.println(line);
        }

        // Example usage of FileUtils.getLines() method
        try (ReversedLinesFileReader reader = new ReversedLinesFileReader(tempFile, "UTF-8")) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }

        // Example usage of FileUtils.listFiles() method
        Collection<File> files = FileUtils.listFiles(new File("."), TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        // Cleanup
        FileUtils.forceDelete(tempFile);
    }
}