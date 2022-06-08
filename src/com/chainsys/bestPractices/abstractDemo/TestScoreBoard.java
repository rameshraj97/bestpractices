package com.chainsys.bestPractices.abstractDemo;

public class TestScoreBoard {

    public static void main(String[] args) {

        ScoreBoard sb = ScoreBoard.createObject();
        System.out.println(sb.largestScore);
        sb.largestScore = 198;
        System.out.println(sb.largestScore);
    }

}