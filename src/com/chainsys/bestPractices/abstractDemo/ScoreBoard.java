package com.chainsys.bestPractices.abstractDemo;

public class ScoreBoard {
    public int largestScore = 183;

    private ScoreBoard() {
        System.out.println("object created for ScoreBoard");

    }

    public static ScoreBoard createObject() {
        return new ScoreBoard();
    }
}