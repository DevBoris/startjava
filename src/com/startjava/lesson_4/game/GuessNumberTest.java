package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя игрока № 1: ");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя игрока № 2: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String choice;
        do {
            game.play();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                choice = scan.next();
            } while(!choice.equals("да") && !choice.equals("нет"));
        } while(choice.equals("да"));
    }
}