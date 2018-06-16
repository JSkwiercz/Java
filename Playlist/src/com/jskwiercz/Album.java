package com.jskwiercz;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            System.out.println("Song added");
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        if (findSong(title) != null) {
            playlist.add(findSong(title));
            return true;
        }
        return false;
    }

    public boolean removeFromPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= playlist.size()) {
            playlist.remove(playlist.get(index));
            return true;
        }
        System.out.println("This playlist doesn't have a track " + trackNumber);
        return false;
    }

    public boolean removeFromPlaylist(String title, LinkedList<Song> playlist) {
        Song songToRemove = findSongPlaylist(title, playlist);
        if (songToRemove != null) {
            playlist.remove(songToRemove);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }

    private Song findSongPlaylist(String title, LinkedList<Song> playlist) {
        for (Song checkedSong : playlist) {
            if (checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }

}
