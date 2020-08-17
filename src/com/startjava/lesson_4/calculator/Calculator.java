package com.startjava.lesson_4.calculator;

public class Calculator {
    public int firstNum;
    public int secondNum;
    public char sign;

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

    public void split(String expression) {
        String[] fillExpression = expression.split(" ", 3);
        firstNum = Integer.parseInt(fillExpression[0]);
        sign = fillExpression[1].charAt(0);
        secondNum = Integer.parseInt(fillExpression[2]);
    }

    public int calculate() {
        switch(sign) {
            case '*' :
                return Math.multiplyExact(firstNum, secondNum);
            case '/' :
                return Math.floorDiv(firstNum, secondNum);
            case '+' :
                return Math.addExact(firstNum, secondNum);
            case '-' :
                return Math.subtractExact(firstNum, secondNum);
            case '%' :
                return Math.floorMod(firstNum, secondNum);
            case '^' :
                return  (int) Math.pow(firstNum, secondNum);
            default :
                System.out.println("Операция над числами не поддерживается.");
                return 0;
        }
    }
}