package com.startjava.lesson_2.game;
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
        randomNum = random.nextInt(101);
        do {
            inputNumber(player1);
            if(compare(player1)) {
                break;
            }
            inputNumber(player2);
        } while(!compare(player2));
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " ������� �����, ���������� �����������: ");
        player.setNumber(scan.nextInt());
    }

    private boolean compare(Player player) {
        if(player.getNumber() < randomNum) {
            System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������. �����: " + randomNum);
        } else if(player.getNumber() > randomNum){
            System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������. �����: " + randomNum);
        } else if(player.getNumber() == randomNum) {
            System.out.println("�� �������. �����: " + randomNum);
            return true;
        }
        return false;
    }
}