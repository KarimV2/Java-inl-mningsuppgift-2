package oop;

import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a TextCounter object
        TextCounter counter = new TextCounter();

        // Read in text from the command line
        while (true) {
            String line = scanner.nextLine();

            // Check if the line contains the word "stop"
            if (line.equals("stop")) {
                break;
            }

            // Print the line of text
            System.out.println(line);

            // Increment the line and character counts
            counter.incrementLineCount();
            counter.incrementCharacterCount(line.length());
        }

        // Print the number of lines and characters
        System.out.println("Number of lines: " + counter.getLineCount());
        System.out.println("Number of characters: " + counter.getCharacterCount());
    }
}