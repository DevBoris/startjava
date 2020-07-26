package com.startjava.lesson_1.calculatior;

class Calculator {
    public static void main(String[] args) {
        int firstNum = 6;
        int secondNum = 8;
        char operation = '^';

        if(operation == '*') {
            System.out.println(firstNum + "" + operation + "" + secondNum + "=" + (firstNum * secondNum));
        } else if(operation == '/') {
            System.out.println(firstNum + "" + operation + "" + secondNum + "=" + (firstNum / secondNum));
        } else if(operation == '+') {
            System.out.println(firstNum + "" + operation + "" + secondNum + "=" + (firstNum + secondNum));
        } else if(operation == '-') {
            System.out.println(firstNum + "" + operation + "" + secondNum + "=" + (firstNum - secondNum));
        } else if(operation == '%') {
            System.out.println(firstNum + "" + operation + "" + secondNum + "=" + (firstNum % secondNum));
        } else if(operation == '^') {
            int result = 1;
            for(int i = 0; i < secondNum; i++) {
                result *= firstNum;
            }
            System.out.println(firstNum + "" + operation + "" + secondNum + "=" + result);
        }
    }
}