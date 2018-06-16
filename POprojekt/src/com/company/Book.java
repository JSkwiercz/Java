package com.company;

public class Book extends Item implements Iinfo {

    private int pages;
    private String cover;

    public Book(int id, String title, String author, int pages, String cover) {
        super(id, title, author);
        this.pages = pages;
        this.cover = cover;
    }

    @Override
    public void getInfo() {
        System.out.println("Title: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nPages: " + this.pages +
                "\nCover: " + this.cover);

    }

    @Override
    public void findPlace() {

    }
}
