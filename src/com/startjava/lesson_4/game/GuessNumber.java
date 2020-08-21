package com.startjava.lesson_4.game;

//import java.util.Arrays;
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
            inputNumber(player1);
            if((player2.getAttempt() == 9) && (player1.getAttempt() == 10)) {
                if(compare(player1)) {
                    break;
                } else {
                    inputNumber(player2);
                    player2.setAttempt(attempt);
                    compare(player2);
                    break;
                }
            } else if(compare(player1)) {
                break;
            }
            player2.setAttempt(attempt);
            inputNumber(player2);
            attempt++;
        } while(!compare(player2));

        System.out.println(player1.getName() + player1.printGuessNums());
        System.out.println(player2.getName() + player2.printGuessNums());
        player1.clear();
        player2.clear();
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " введите число, загаданное компьютером: ");
        player.setGuessNumber(scan.nextInt());
//      player.setGuessNumber(player.getNumber());
    }

    private boolean compare(Player player) {
        if(player.getGuessNumber() < randomNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер. Число: " + randomNum);
        } else if (player.getGuessNumber() > randomNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер. Число: " + randomNum);
        } else if (player.getGuessNumber() == randomNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " c " + player.getAttempt() + " попытки");
            return true;
        } else if(player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки!");
            return true;
        }
        return false;
    }
}