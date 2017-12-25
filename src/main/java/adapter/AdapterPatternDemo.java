package adapter;

import adapter.impl.AudioPlayer;

/**
 * Created by wangshaonan on 17/12/25.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","缘分一道桥.mp3");
        audioPlayer.play("mp4","Minions.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","TokyoHot.avi");
    }
}
