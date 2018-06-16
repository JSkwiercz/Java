package com.jskwiercz;

public class TheRoom {
    private Bed bed;
    private Guitar guitar;
    private Wardrobe wardrobe;

    public TheRoom(Bed bed, Guitar guitar, Wardrobe wardrobe) {
        this.bed = bed;
        this.guitar = guitar;
        this.wardrobe = wardrobe;
    }

    public Wardrobe getWardrobe() {
        return this.wardrobe;
    }

    public void showGuitar() {
        specification();
    }

    private void specification() {
        System.out.println("This is " + guitar.getType());
        guitar.play();
    }
}
