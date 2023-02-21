package Morse;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeTranslatorTest {
    // Testar engelska till morsekod
    @Test
    public void testToMorseCode() {
        String input = "Hello world";
        String expectedOutput = ".... . .-.. .-.. --- .-- --- .-. .-.. -.. ";
        String actualOutput = MorseCodeTranslator.toMorseCode(input);
        assertEquals(expectedOutput, actualOutput);
    }
// Testar specialtecken inte existerar i morsekod
    @Test
    public void testToEnglishException() {
        String input = "@";
        String expectedOutput = "Morsekoden innehåller ogiltiga tecken och kan inte översättas.";
        String actualOutput = MorseCodeTranslator.toEnglish(input);
        assertEquals(expectedOutput, actualOutput);
    }
    // Angivet morsekod inte existerar
    @Test
    public void testFromMorseCodeException() {
        String input = "--...--";
        String expectedOutput = "Morsekoden existerar inte.";
        String actualOutput = MorseCodeTranslator.toEnglish(input);
        assertEquals(expectedOutput, actualOutput);
    }


}

