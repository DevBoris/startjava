package com.startjava.lesson_2.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String choice;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("¬ведите первое число: ");
            calc.setFirstNum(scan.nextInt());
            System.out.print("¬ведите знак математической операции: ");
            calc.setSign(scan.next().charAt(0));
            System.out.print("¬ведите второе число: ");
            calc.setSecondNum(scan.nextInt());
            calc.calculate();
            do {
                System.out.print("’отите продолжить? [да/нет]: ");
                choice = scan.next();
            } while(!choice.equals("да") && !choice.equals("нет"));
        } while(choice.equals("да"));
    }
}