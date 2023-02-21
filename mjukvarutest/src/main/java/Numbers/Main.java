package Numbers;

import java.util.Scanner; // Vi importerar Scanner-klassen för att kunna läsa in text från användaren

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Skapar ett nytt Scanner-objekt som vi kallar "input"
        System.out.print("Ange en bokstav: "); // Skriver ut en fråga till användaren
        char letter = input.next().charAt(0); // Läser in den nästa textsträngen från användaren och sparar den första bokstaven i "letter"

        switch (letter) { // Börjar en switch-sats baserad på värdet i "letter"
            case 'A': // Om "letter" är "A", skriver vi ut följande text:
                System.out.println("acetylsalicylsyra");
                break; // Avslutar switch-satsen
            case 'B': // Om "letter" är "B", skriver vi ut följande text:
                System.out.println("barnvårdscentralen");
                break; // Avslutar switch-satsen
            case 'C': // Om "letter" är "C", skriver vi ut följande text:
                System.out.println("citronsyracykeln");
                break; // Avslutar switch-satsen
            case 'D': // Om "letter" är "D", skriver vi ut följande text:
                System.out.println("djungeltelegrafen");
                break; // Avslutar switch-satsen
            default: // Om inget av ovanstående stämmer, skriver vi ut följande text:
                System.out.println("Ogiltig bokstav");
                break; // Avslutar switch-satsen
        }
    }
}
