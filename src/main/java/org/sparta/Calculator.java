package org.sparta;

public class Calculator {
    public int add(int number1, int number2) {

        return number1 + number2;
    }
    public int subtract(int number1, int number2){

        return number1- number2;
    }
    public int multiply(int number1, int number2){

        return number1*number2;
    }
    public int divide(int number1, int number2){

        return number1/number2;
    }
    public boolean isEven(int number1){
        System.out.println(number1%2);
        return number1%2 == 0;
    }
}
