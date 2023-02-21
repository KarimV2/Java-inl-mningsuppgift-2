package oop;

public class TextCounter {
    // Variables to keep track of the number of lines and characters
    private int lineCount = 0;
    private int characterCount = 0;

    // Method to increment the line count
    public void incrementLineCount() {
        lineCount++;
    }

    // Method to increment the character count
    public void incrementCharacterCount(int numChars) {
        characterCount += numChars;
    }

    // Method to get the current line count
    public int getLineCount() {
        return lineCount;
    }

    // Method to get the current character count
    public int getCharacterCount() {
        return characterCount;
    }
}