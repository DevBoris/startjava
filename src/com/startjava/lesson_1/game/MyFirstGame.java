package com.startjava.lesson_1.game;

class MyFirstGame {
    public static void main(String[] args) {
        int randNum = 7;
        int userNum = 68;

        while(randNum != userNum) {
            if(userNum < randNum) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNum++;
            } else if(userNum > randNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                userNum--;
            }
        }
        System.out.println("Вы угадали! число: " + randNum);
    }
}