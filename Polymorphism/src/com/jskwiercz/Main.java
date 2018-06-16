package com.jskwiercz;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Starting enigne...");
    }

    public int accelerate() {
        return wheels * cylinders;
    }

    public boolean brake() {
        return this.engine = false;
    }

    public String getName() {
        return name;
    }

    public Car(int cylinders) {
        this.cylinders = cylinders;
    }
}

class Clio extends Car {
    public Clio(String name, int cylinders) {
        super(name, cylinders);
    }

    public int accelerate() {
        return 8 * ;
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
