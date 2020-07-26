package com.startjava.lesson_2.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String choice;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("������� ������ �����: ");
            calc.setFirstNum(scan.nextInt());
            System.out.print("������� ���� �������������� ��������: ");
            calc.setSign(scan.next().charAt(0));
            System.out.print("������� ������ �����: ");
            calc.setSecondNum(scan.nextInt());
            calc.calculate();
            do {
                System.out.print("������ ����������? [��/���]: ");
                choice = scan.next();
            } while(!choice.equals("��") && !choice.equals("���"));
        } while(choice.equals("��"));
    }
}