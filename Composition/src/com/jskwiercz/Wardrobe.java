package com.jskwiercz;

public class Wardrobe {
    private int numberOfShelves;
    private int doors;
    private int high;
    private int width;
    private int depth;

    public Wardrobe(int numberOfShelves, int doors, int high, int width, int depth) {
        this.numberOfShelves = numberOfShelves;
        this.doors = doors;
        this.high = high;
        this.width = width;
        this.depth = depth;
    }

    public void makeSpace() {
        System.out.println("Making space...");
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public int getDoors() {
        return doors;
    }

    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
}
