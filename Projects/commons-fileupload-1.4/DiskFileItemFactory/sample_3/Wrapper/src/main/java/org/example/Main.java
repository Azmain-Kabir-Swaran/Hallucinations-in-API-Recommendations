package org.example;


import java.util.List;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.<d>.<e>.<f>.<g>;

public class Main {

    public static void main(String[] args) {
        FileItemFactory fileItemFactory = new DiskFileItemFactory(1024, null);
        List<FileItem> items = null;
        //... do something with file items ...
    }
}