package com.jskwiercz;

public class Main {

    public static void main(String[] args) {
        SumScore(10,20);
        SumScore("Navaryn", 10);
    }

    public static void SumScore(String name, int score) {
        System.out.println(name + "'s score is " + (score * 50));
    }

    public static void SumScore(int score1, int score2) {
        if (score1 > score2) {
            System.out.println("Score 1 is higher than score 2");
        } else {
            System.out.println("Score 2 is higher than score 1");
        }
    }

}
