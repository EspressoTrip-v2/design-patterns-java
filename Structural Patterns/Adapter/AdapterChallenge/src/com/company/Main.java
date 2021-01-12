package com.company;

public class Main {

    public static void main(String[] args) {

        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Juan_Music.mp3");

        AdvancedMediaPlayerInterface mp4Player = new Mp4();
        MediaPlayerInterface advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "Alone.mp4");

        AdvancedMediaPlayerInterface vlcPlayer = new Vlc();
        MediaPlayerInterface advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "Its_all_about_you.vlc");


    }
}
