package com.company;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {
    AdvancedMediaPlayerInterface advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface advanced) {
        this.advancedMediaPlayer = advanced;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMediaPlayer.loadFileName(filename);
        advancedMediaPlayer.listen();
    }
}
