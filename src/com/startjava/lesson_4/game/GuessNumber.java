package com.startjava.lesson_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNum;
    private int attempt;
    private Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("У вас 10 попыток");
        randomNum = random.nextInt(101);
        attempt = 1;
        do {
            player1.setAttempt(attempt);
            if(!makeMove(player1)) {
                break;
            }
            player2.setAttempt(attempt);
            attempt++;
        } while(makeMove(player2));

        System.out.println(printGuessNums(player1));
        System.out.println(printGuessNums(player2));
        player1.clear();
        player2.clear();
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " введите число, загаданное компьютером: ");
        player.setGuessNumber(scan.nextInt());
    }

    private boolean compare(Player player) {
        if(player.getGuessNumber() < randomNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер. Число: " + randomNum);
        } else if (player.getGuessNumber() > randomNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер. Число: " + randomNum);
        } else if (player.getGuessNumber() == randomNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " c " + player.getAttempt() + " попытки");
            return true;
        }
        return false;
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        if(!compare(player)) {
            if(player.getAttempt() == 10) {
                System.out.println("У " + player.getName() + " закончились попытки!");
                return false;
            }
            return true;
        } else return false;
    }

    private String printGuessNums(Player player) {
        String stringNums = ":";
        int[] nums = player.getGuessNums();
        for(int num : nums) {
            stringNums += String.valueOf(" " + num);
        }
        return player.getName() + stringNums;
    }
}