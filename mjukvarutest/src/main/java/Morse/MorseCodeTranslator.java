package Morse;

import java.util.HashMap;

public class MorseCodeTranslator {

    // En array med alla bokstäver och siffror i morsekod
    private static final String[] MORSE_CODE_TABLE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",".--.-", ".-.-.-", "..--.." };

    // En array med alla bokstäver och siffror i alfabetet
    private static final String[] ALPHABET = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",".", ",", "?"};

    // En Hashmap som översätter mellan morsekod och bokstäver/siffror
    private static final HashMap<String, String> MORSE_TO_ENGLISH = new HashMap<>();

    // En Hashmap som översätter mellan bokstäver/siffror och morsekod
    private static final HashMap<String, String> ENGLISH_TO_MORSE = new HashMap<>();

    static {
        // Fyll hashmapparna med mappingar// matchar platserna mellan alfabetet och morsekoden
        for (int i = 0; i < MORSE_CODE_TABLE.length; i++) {
            MORSE_TO_ENGLISH.put(MORSE_CODE_TABLE[i], ALPHABET[i]);
            ENGLISH_TO_MORSE.put(ALPHABET[i], MORSE_CODE_TABLE[i]);
        }
    }

    // Metod som översätter engelska texten till morsekod
    public static String toMorseCode(String english) {
        english = english.toUpperCase();
        StringBuilder result = new StringBuilder();

        if (!english.matches("[A-Z0-9,.? ]+")) {
            return "Texten innehåller ogiltiga tecken och kan inte översättas.";
        }

        // Loopa igenom varje tecken i texten
        for (int i = 0; i < english.length(); i++) {
            char c = english.charAt(i);

            // Hitta morsekoden för tecknet från hashmappen
            String code = ENGLISH_TO_MORSE.get(Character.toString(c));

            // Om tecknet finns i hashmappen, lägg till morsekoden till resultatet
            if (code != null) {
                result.append(code).append(" ");
            }
        }
        // Returnera resultatet
        return result.toString();
    }



    // Metod som översätter morsekod till engelska texten
    public static String toEnglish(String morseCode) {
        StringBuilder result = new StringBuilder();
// tillåter - . mellanslag
        if (!morseCode.matches("[-.\\s]+")) {
            return "Morsekoden innehåller ogiltiga tecken och kan inte översättas.";}

        // Dela upp morsekoden i ord med hjälp av två mellanslag
        String[] words = morseCode.split("\\s{2}");

// Loopa över alla ord
        for (String word : words) {
            String[] codes = word.split("\\s");
            for (String code : codes) {
                String letter = MORSE_TO_ENGLISH.get(code);
                if (letter != null) {
                    result.append(letter);
                }
                else{
                    return "Morsekoden existerar inte.";

                }
            }
            // Lägger till ett mellanslag mellan orden
            result.append(" ");
        }
        // Returnera översättningen som en sträng o tar bort mellanslag
        return result.toString();
    }
}
