package Morse;
import java.util.Scanner;

public class MorseCodeTranslatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vill du översätta från morsekod till engelska (M) eller från engelska till morsekod (E)?");
        String choice = scanner.nextLine().toUpperCase();

        if (choice.equals("M")) {
            System.out.println("Ange morsekod att översätta:");
            String morseCode = scanner.nextLine();
            String english = MorseCodeTranslator.toEnglish(morseCode);
            System.out.println("Engelska: " + english);
        } else if (choice.equals("E")) {
            System.out.println("Ange engelsk text att översätta:");
            String english = scanner.nextLine();
            String morseCode = MorseCodeTranslator.toMorseCode(english);
            System.out.println("Morsekod: " + morseCode);
        } else {
            System.out.println("Ogiltigt val. Programmet avslutas.");
        }

        scanner.close();
    }

}
