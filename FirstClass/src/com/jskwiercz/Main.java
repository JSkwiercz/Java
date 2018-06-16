package com.jskwiercz;

public class Main {

    public static void main(String[] args) {

        Car renault = new Car();
        Car landRover = new Car();

        renault.setModel("Clio");
        System.out.println("Model is " + renault.getModel());

    }
}
