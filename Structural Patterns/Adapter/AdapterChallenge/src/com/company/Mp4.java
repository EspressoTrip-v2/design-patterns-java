package com.company;

public class Mp4 implements AdvancedMediaPlayerInterface {
    String myFile;

    @Override
    public void loadFileName(String fileName) {
        this.myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + this.myFile);
    }
}
