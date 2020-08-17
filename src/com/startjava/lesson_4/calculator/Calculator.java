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
        String[] arrayOfExpression = expression.split(" ", 3);
        firstNum = Integer.parseInt(arrayOfExpression[0]);
        sign = arrayOfExpression[1].charAt(0);
        secondNum = Integer.parseInt(arrayOfExpression[2]);
    }

    public void calculate() {
        int result;
        switch(sign) {
            case '*' :
                System.out.println("Результат вычисления: " + Math.multiplyExact(firstNum, secondNum));
                break;
            case '/' :
                System.out.println("Результат вычисления: " + Math.floorDiv(firstNum, secondNum));
                break;
            case '+' :
                System.out.println("Результат вычисления: " + Math.addExact(firstNum, secondNum));
                break;
            case '-' :
                System.out.println("Результат вычисления: " + Math.subtractExact(firstNum, secondNum));
                break;
            case '%' :
                System.out.println("Результат вычисления: " + Math.floorMod(firstNum, secondNum));
                break;
            case '^' :
                System.out.println("Результат вычисления: " + (int)Math.pow(firstNum, secondNum));
                break;
            default :
                System.out.println("Операция над числами не поддерживается.");
                break;
        }
    }
}