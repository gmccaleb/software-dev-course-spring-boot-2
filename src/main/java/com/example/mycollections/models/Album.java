package com.example.mycollections.models;

public class Album extends LibraryItem {
    private String artist;
    private int trackCount;

    public Album(String name, int year, String artist, int trackCount) {
        super(name, year);
        this.artist = artist;
        this.trackCount = trackCount;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    @Override
    public String toString() {
        return name + " by " + artist;
    }
}
