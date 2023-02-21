package oop;

import java.util.Scanner;

public class readUserInput {

    int score1;
    int score2;
    int score3;
    int score4;

    int sum;

    public void word1() {

        System.out.println("fine");
        Scanner scan = new Scanner(System.in);
        String fine = scan.nextLine();

        if (fine.equals("fine")) {

            score1 = 1;
        } else {
            score1 = 0;
        }
        System.out.println("You got " + score1 + " score!");
    }

}
