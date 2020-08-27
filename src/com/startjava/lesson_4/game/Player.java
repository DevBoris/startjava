package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] guessNums = new int[10];
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

    public int getAttempt() {
        return attempt;
    }

    public void setGuessNumber(int number) {
        attempt++;
        guessNums[attempt - 1] = number;
    }

    public int getLastNumber() {
        return guessNums[attempt - 1];
    }

    public int[] getGuessNums() {
        return Arrays.copyOf(guessNums, attempt);
    }

    public void clear() {
        Arrays.fill(guessNums, 0, attempt, 0);
    }
}