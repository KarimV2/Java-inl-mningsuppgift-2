package oop;
public class LineCounter {
    private int lineCount;
    private int charCount;

    public LineCounter() {
        this.lineCount = 0;
        this.charCount = 0;
    }

    public void processLine(String line) {
        this.lineCount++;
        this.charCount += line.length();
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getCharCount() {
        return this.charCount;
    }
}
