package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DecodeMessage {
    public static String decodeMessage(File file) {
        String decodedMessage = "";
        try (Scanner readFile = new Scanner(file)){
            while (readFile.hasNextLine()){
                String line = readFile.nextLine();
                String[] strArray = line.split(" ");
                for (String str: strArray) {
                    char[] charArray = str.toCharArray();
                    for (int i = 0; i < charArray.length; i++) {
                        charArray[i] = (char) ((int)charArray[i] - (charArray.length));
                        decodedMessage += charArray[i];
                    }
                    if (!(strArray[strArray.length-1].equals(str))) {
                        decodedMessage += " ";
                    }
                }
                decodedMessage += "\n";
                }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        decodedMessage = decodedMessage.replaceAll("[\\r\\n]+$", "");
        return decodedMessage;
    }
}
