package oop;

import java.util.Scanner;

public class CalculatorObjekt {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter number5: ");
        int firstNumber=Integer.parseInt(scan.nextLine());

        System.out.println("Enter number4: ");
        int secondNumber=Integer.parseInt(scan.nextLine());

        Calculator cal=new Calculator(firstNumber,secondNumber);
        cal.printNumber();

    }


}
