package com.company;

public class Item implements Iinfo {
    private int id;
    private String title;
    private String author;

    public Item(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    @Override
    public void getInfo() {

    }

    @Override
    public void findPlace() {

    }
}
