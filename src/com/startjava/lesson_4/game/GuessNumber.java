package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNum;
    private Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("У вас 10 попыток");
        randomNum = random.nextInt(101);
        do {
            if(makeMove(player1)) {
                break;
            }
        } while(!makeMove(player2));

        printGuessNums(player1);
        printGuessNums(player2);
        player1.clear();
        player2.clear();
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        if(!compare(player)) {
            if(player.getAttempt() == 10) {
                System.out.println("У " + player.getName() + " закончились попытки!");
//              return true;
            }
            return false;
        } else return true;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " введите число, загаданное компьютером: ");
        player.setGuessNumber(scan.nextInt());
    }

    private boolean compare(Player player) {
        if(player.getLastNumber() == randomNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " c " + player.getAttempt() + " попытки");
            return true;
        } else {
            String str = player.getLastNumber() < randomNum ? " меньше " : " больше ";
            System.out.println("Введенное вами число" + str + "того, что загадал компьютер. Число: " + randomNum);
        }
        return false;
    }

    private void printGuessNums(Player player) {
        System.out.print(player.getName() + ":");
        for(int num : player.getGuessNums()) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}