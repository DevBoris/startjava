package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] guessNum = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void setGuessNumber(int number) {
        guessNum[attempt - 1] = number;
    }

    public int[] getGuessNum() {
        return Arrays.copyOf(guessNum, attempt);
    }
    public void clearGuessNum() {
        Arrays.fill(guessNum, 0, attempt, 0);
    }
}