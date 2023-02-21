package forelesning3;

import java.util.ArrayList;
import java.util.Scanner;


public class Animals {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> animals = new ArrayList<>();
        String[] frogs = new String[9];

        animals.add ("Kermit the Frog");
        // frogs[0] = " Kermit the Frog";


        //  for(int i=0;i< frogs.length;i++) {

   // frogs[i] = scan.nextLine();
     //   }

        String frog = scan.nextLine();
        while(frog.equals("eksit")) {
            animals.add("frog");
            frog = scan.nextLine();
        }

        System.out.println(animals.get(0));
        System.out.println(frogs[0]);
    }
}
