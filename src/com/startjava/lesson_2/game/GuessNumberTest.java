package com.startjava.lesson_2.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ��� ������ � 1: ");
        Player player1 = new Player(scan.nextLine());
        System.out.println("������� ��� ������ � 2: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String choice;
        do {
            game.play();
            do {
                System.out.println("������ ����������? [��/���]: ");
                choice = scan.next();
            } while(!choice.equals("��") && !choice.equals("���"));
        } while(choice.equals("��"));
    }
}