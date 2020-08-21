package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
//  private int number;
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
/*
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
*/
    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void setGuessNumber(int number) {
        guessNums[attempt - 1] = number;
    }

    public int getGuessNumber() {
        return guessNums[attempt - 1];
    }
/*
    public int[] getGuessNums() {
        return Arrays.copyOf(guessNums, attempt);
    }
*/
    public String printGuessNums() {
        String pushGuessNums = "";
        for(int num : Arrays.copyOf(guessNums, attempt)) {
            pushGuessNums += String.valueOf(" " + num);
        }
        return pushGuessNums;
    }

    public void clear() {
        Arrays.fill(guessNums, 0, attempt, 0);
    }
}