package org.example;


import java.io.File;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.AgeFileFilter;

public class Main {
    
    public static void main(String[] args) {
        File folder = new File("Your/File/Path");
        
        // Last modified within the last 30 days
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -30);
        
        AgeFileFilter ageFileFilter = new AgeFileFilter(calendar.getTime(), false);
        
        File files[] = folder.listFiles(ageFileFilter);
        
        for(File file : files) {
            FileUtils.deleteQuietly(file);
        }
    }
}