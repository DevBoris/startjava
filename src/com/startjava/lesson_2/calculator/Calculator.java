package com.startjava.lesson_2.calculator;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private char sign;

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    // calculation
    public int calculate() {
        int result = 0;
        switch(sign) {
            case '*':
                result = firstNum * secondNum;
                System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
                break;
            case '/':
                result = firstNum / secondNum;
                System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
                break;
            case '+':
                result = firstNum + secondNum;
                System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
                break;
            case '-':
                result = firstNum - secondNum;
                System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
                break;
            case '%':
                result = firstNum % secondNum;
                System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
                break;
            case '^':
                result = 1;
                for (int i = 0; i < secondNum; i++) {
                    result *= firstNum;
                }
                System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
                break;
        }
        return result;
    }
}