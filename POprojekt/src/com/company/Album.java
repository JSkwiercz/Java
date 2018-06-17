package com.company;

import java.util.ArrayList;

public class Album extends Item {

    private ArrayList<AudioFile> songs;

    public Album(int id, String title, String author) {
        super(id, title, author);
        this.songs = new ArrayList<AudioFile>();
    }

    @Override
    public void getInfo() {
        System.out.println("Type: CD-Album\nTitle: " + getTitle() +
                "\nAuthor: " + getAuthor() +
                "\nSongs: " + songs.size() + "\n");
    }

    @Override
    public void findPlace() {

    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new AudioFile(title, duration));
            System.out.println("Song added");
            return true;
        }
        return false;
    }

    private AudioFile findSong(String title) {
        for (AudioFile checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }
}
