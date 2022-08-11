package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteOutput {
    public static void writeOutput(File outputFile, String str) {
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            writer.println(str);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
