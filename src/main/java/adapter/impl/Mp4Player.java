package adapter.impl;

import adapter.interfaces.AdvancedMediaPlayer;

/**
 * Created by wangshaonan on 17/12/25.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        //do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp3 file. Name: "+fileName);
    }
}
