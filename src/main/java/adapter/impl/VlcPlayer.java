package adapter.impl;

import adapter.interfaces.AdvancedMediaPlayer;

/**
 * Created by wangshaonan on 17/12/25.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+fileName);
    }

    public void playMp4(String fileName) {
        //do nothing
    }
}
