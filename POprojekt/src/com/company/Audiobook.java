package com.company;

import java.util.ArrayList;

public class Audiobook extends Item implements Iinfo {

    private double duration;
    private ArrayList<AudioFile> chapters;

    public Audiobook(int id, String title, String author, double duration) {
        super(id, title, author);
        this.chapters = new ArrayList<AudioFile>();
        this.duration = duration;
    }

    @Override
    public void getInfo() {
        System.out.println("Title: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nChapters: " + chapters.size());
    }

    @Override
    public void findPlace() {

    }
}
