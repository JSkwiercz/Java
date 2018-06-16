package com.jskwiercz;

public class Main {

    public static void main(String[] args) {
        Bed theBed = new Bed(40, 60, 200);
        Guitar theGuitar = new Guitar(4, "Bass", "Fender");
        Wardrobe theWardrobe = new Wardrobe(6, 2, 200, 50, 50);


	TheRoom newroom = new TheRoom(theBed, theGuitar, theWardrobe);

	newroom.showGuitar();
	newroom.getWardrobe().makeSpace();

    }
}
