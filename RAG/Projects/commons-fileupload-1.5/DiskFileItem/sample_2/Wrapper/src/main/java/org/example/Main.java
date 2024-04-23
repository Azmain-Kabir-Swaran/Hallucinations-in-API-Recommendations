package org.example;


import org.apache.commons.fileupload.disk.DiskFileItem;
import javax.servlet.http.HttpServletRequest;

public class Main {

    public static void main(String[] args) {
        HttpServletRequest request = null; // get from somewhere else
        DiskFileItem fileItem = new DiskFileItem("fieldName", "text/plain", false, "fileName.txt");
        // set the stream etc. here...

        // do something with fileItem now
    }
}