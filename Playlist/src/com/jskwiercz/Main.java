package com.jskwiercz;

import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {

        }

    }

    public static void showInfo() {
        System.out.println("Pick what you wanna do:\n" +
                "1 - Add Album\n" +
                "3 - Add song to album\n" +
                "2 - Show info about album\n" +
                "4 - Add song to playlist\n" +
                "5 - Remove song from playlist");
    }
}