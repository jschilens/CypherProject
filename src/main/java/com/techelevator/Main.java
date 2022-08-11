package com.techelevator;

import java.io.File;
import java.util.Scanner;

import static com.techelevator.DecodeMessage.decodeMessage;
import static com.techelevator.EncodeMessage.encodeMessage;
import static com.techelevator.WriteOutput.writeOutput;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Do you want to [e]ncode or [d]ecode a file? ");
        String eOrD = "";
        while (!(eOrD.equals("e")) && !(eOrD.equals("d"))) {
            eOrD = keyboardInput.nextLine();
            eOrD = eOrD.toLowerCase();
            if (!(eOrD.equals("e")) && !(eOrD.equals("d"))) {
                System.out.println("\n" + "Choose [e] or [d] to proceed.");
                System.out.print("Do you want to [e]ncode or [d]ecode a file? ");
            }
        }
        System.out.println("What file should we read? ");
        String input = "output.txt"; //keyboardInput.nextLine();
        File fileInput = new File(input);
        System.out.println("What file should we write? ");
        String output = "output.txt"; //keyboardInput.nextLine();
        File fileOutput = new File("output.txt");
        System.out.println();
        if (eOrD.equals("e")) {
            String encodedMessage = encodeMessage(fileInput);
            System.out.print(encodedMessage);
            writeOutput(fileOutput, encodedMessage);
        } else if (eOrD.equals("d")) {
            String decodedMessage = decodeMessage(fileInput);
            System.out.print(decodedMessage);
            writeOutput(fileOutput, decodedMessage);
        } else {
            System.out.println("How did you even get this message?");
        }
    }
}
