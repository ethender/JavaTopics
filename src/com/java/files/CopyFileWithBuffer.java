package com.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class CopyFileWithBuffer {

    public static void main(String[] args) {
        File source = new File("inventory-snapshot.bin");
        File copy = new File("inventory-copy.bin");

        try {
            try (FileOutputStream output = new FileOutputStream(source)) {
                output.write(new byte[] {0, 1, 2, 3, (byte) 255, (byte) 128, 64, 32, 16, 8});
            }

            // TODO: Copy source to copy using FileInputStream, FileOutputStream, and a 4-byte buffer.
            try(FileInputStream input = new FileInputStream(source)) {
                FileOutputStream output2 = new FileOutputStream(copy);
                byte[] buffer = new byte[4];

                int bytesRead;
                while ((bytesRead = input.read(buffer)) != -1) {
                    output2.write(buffer, 0, bytesRead);
                }
            }
            boolean same = Arrays.equals(Files.readAllBytes(source.toPath()), Files.readAllBytes(copy.toPath()));
            System.out.println("Source bytes: " + source.length());
            System.out.println("Copy bytes: " + copy.length());
            System.out.println("Copies match: " + same);
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
