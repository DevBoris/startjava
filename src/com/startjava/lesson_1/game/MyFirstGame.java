package com.startjava.lesson_1.game;

class MyFirstGame {
    public static void main(String[] args) {
        int randNum = 7;
        int userNum = 68;

        while(randNum != userNum) {
            if(userNum < randNum) {
                System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
                userNum++;
            } else if(userNum > randNum) {
                System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
                userNum--;
            }
        }
        System.out.println("�� �������! �����: " + randNum);
    }
}