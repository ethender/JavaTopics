package com.java.files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFiles {


    public static void main(String[] args) throws IOException {
        File f = new File("E:/test.txt");

        System.out.println(f.exists());

        System.out.println(f.getAbsolutePath());
        System.out.println("Path: "+f.getPath());

        /* File Metadata Quries */
        System.out.println("***************************************");
        System.out.println("Exists: "+f.exists());

        System.out.println("Is File: "+f.isFile());
        System.out.println("Is Directory: "+f.isDirectory());
        System.out.println("Is Hidden: "+f.isHidden());
        System.out.println("Is Absolute: "+f.isAbsolute());
        System.out.println("Is Readable: "+f.canRead());
        System.out.println("Is Writable: "+f.canWrite());
        System.out.println("Is Executable: "+f.canExecute());
        System.out.println("Last Modified: "+new Date(f.lastModified()));
        System.out.println("Length: "+f.length());



        // Creating file
        File testFile = new File("E:/check.txt");
        System.out.println("File Created: "+testFile.createNewFile());
        System.out.println(":Exists Now: "+testFile.exists());
        //System.out.println("File Deleted: "+testFile.delete());

    }
}
