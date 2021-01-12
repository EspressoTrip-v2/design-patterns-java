package com.company;

public class Vlc implements AdvancedMediaPlayerInterface {
    public String myFile;

    @Override
    public void loadFileName(String fileName) {
        this.myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + this.myFile);
    }
}
