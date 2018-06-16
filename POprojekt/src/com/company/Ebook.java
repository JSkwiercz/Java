package com.company;

public class Ebook extends Item implements Iinfo {

    private int pages;
    String format;

    public Ebook(int id, String title, String author, int pages, String format) {
        super(id, title, author);
        this.pages = pages;
        this.format = format;
    }

    @Override
    public void getInfo() {
        System.out.println("Title: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nPages: " + this.pages +
                "\nFormat: " + this.format);
    }

    @Override
    public void findPlace() {

    }
}
