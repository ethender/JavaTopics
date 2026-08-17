package com.java.files;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileUntilAllBytes {

    public static void main(String[] args) {
        String path = "orders.bin";
        int count = 0;
        int sum = 0;

        try {
            try (FileOutputStream output = new FileOutputStream(path)) {
                output.write(new byte[] {3, 7, 12, 20});
            }

            // TODO: Read from path with FileInputStream until read() returns -1.
            // TODO: Increase count for each byte and add the byte value to sum.

            try (FileInputStream input = new FileInputStream(path)) {
                int b;
                while((b = input.read()) != -1){
                    sum += b;
                    count++;
                }
            }

            System.out.println("Read " + count + " bytes");
            System.out.println("Sum: " + sum);
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
