package com.java.files;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Check Each Folder copy file path and to List.
 *
 * After download files
 */
public class CopyOnlyFiles {


    private static final File sourceFile = new File("E:\\workspace\\kony\\v9\\workspace\\BanreservasMultipleIssue");
    private static final File destinationFile = new File("F:\\Test");

    ArrayList<File> filesList = new ArrayList<File>();
    ArrayList<File> folders = new ArrayList<File>();

    public CopyOnlyFiles() {
        folders.add(sourceFile);

    }

    public void start(){
        copyFilesPath();
        pasteFiles2();
    }

    public void copyFilesPath() {
        while(!folders.isEmpty()) {
            File[] files = folders.remove(0).listFiles();
            Arrays.stream(files).forEach(file -> {
                if(file.isDirectory()) {
                    folders.add(file);
                } else {
                    filesList.add(file);
                }
            });
        }
    }


    public void pasteFiles() {
        filesList.forEach(file ->{

            File newFile = new File(destinationFile, file.getName());
            if(!newFile.exists()) {
                try {
                    Files.copy(file.toPath(), newFile.toPath());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else{
                System.out.println("File already exists: " + newFile.getName());
            }
        });
    }

    public void pasteFiles2() {

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        filesList.forEach(file ->{
            executorService.submit(() ->{
                System.out.println("Processing file: " + file.getName());
                File newFile = new File(destinationFile, file.getName());
                if(!newFile.exists()) {
                    try {
                        Files.copy(file.toPath(), newFile.toPath());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    System.out.println("File already exists: " + newFile.getName());
                }
            });
        });

        // 3. Prevent new tasks and shutdown the pool gracefully
        executorService.shutdown();

        try {
            // 4. Block the main thread until all threads finish copying, or 10 minutes pass
            if (executorService.awaitTermination(10, TimeUnit.MINUTES)) {
                System.out.println("🎉 All files copied successfully!");
            } else {
                System.out.println("⏳ Copy operation timed out before completing all files.");
            }
        } catch (InterruptedException e) {
            System.err.println("The copying process was interrupted.");
            Thread.currentThread().interrupt();
        }

    }


    public static void main(String[] args) {
        CopyOnlyFiles copyOnlyFiles = new CopyOnlyFiles();
        copyOnlyFiles.start();
    }
}
