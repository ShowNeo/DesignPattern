package adapter.impl;


import adapter.interfaces.MediaPlayer;

/**
 * Created by wangshaonan on 17/12/25.
 */
public class AudioPlayer implements MediaPlayer {
    public void play(String audioType, String fileName) {
        MediaAdapter mediaAdapter;

        //播放mp3内置支持
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+fileName);
        }

        else if("vlc".equalsIgnoreCase(audioType)
                || "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);

        }else {
            System.out.println("Invalid media. "+audioType+" format not supported");
        }
    }
}
