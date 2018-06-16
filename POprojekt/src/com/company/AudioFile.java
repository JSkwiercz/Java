package com.company;

public class AudioFile {

    private String title;
    private double duration;

    public AudioFile(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
}
