package com.java.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FourByteHeader {
    public static void main(String[] args) {
        File file = new File("badge.bin");
        byte[] header = {80, 78, 71, 10};

        try {
            // TODO: Open a FileOutputStream for file and write header to it.
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(header);
            }

            System.out.println(file.getName() + " bytes: " + file.length());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
