package com.jskwiercz;

public class Guitar {
    private int strings;
    private String type;
    private String manufacturer;

    public Guitar(int strings, String type, String manufacturer) {
        this.strings = strings;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public void play() {
        System.out.println("Trying to play " + getType() + " guitar");
    }

    public int getStrings() {
        return strings;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
