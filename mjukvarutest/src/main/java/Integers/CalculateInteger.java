package oop;

import java.util.Scanner;

public class CalculateInteger {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter the integer");

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        System.out.println("Entered integer is: " + num);
    }

}
