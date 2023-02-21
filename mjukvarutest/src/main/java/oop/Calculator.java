package oop;

public class Calculator {

    private int number5;
    private int number4;
    private int sum;

    public Calculator(int firstNumber, int secondNumber) {

        number5 = firstNumber;
        number4 = secondNumber;


    }

    public void printNumber() {
        sum = number5 + number4;
        System.out.println("sum is:" + sum);
    }
}
