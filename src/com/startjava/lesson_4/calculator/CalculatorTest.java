package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String choice;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите математическое выражение, например 2 ^ 10 : ");
            calculator.split(scan.nextLine());
            System.out.println("Результат вычисления: " + calculator.calculate());
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            } while(!choice.equals("да") && !choice.equals("нет"));
        } while(choice.equals("да"));
    }
}