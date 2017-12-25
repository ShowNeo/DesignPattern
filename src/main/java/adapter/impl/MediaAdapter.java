package adapter.impl;

import adapter.interfaces.AdvancedMediaPlayer;
import adapter.interfaces.MediaPlayer;

/**
 * Created by wangshaonan on 17/12/25.
 * 我们想要让 AudioPlayer 播放其他格式的音频文件。
 * 为了实现这个功能，我们需要创建一个实现了 MediaPlayer 接口的适配器类 MediaAdapter，
 * 并使用 AdvancedMediaPlayer 对象来播放所需的格式。
 * AudioPlayer 使用适配器类 MediaAdapter 传递所需的音频类型，不需要知道能播放所需格式音频的实际类。
 * AdapterPatternDemo，我们的演示类使用 AudioPlayer 类来播放各种格式。
 *
 * 适配器类:
 *  实现目标类的接口，要实现的功能类作为属性传递，在要实现的功能方法中调用功能类。
 *
 */
public class MediaAdapter  implements MediaPlayer{
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new VlcPlayer();
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new Mp4Player();
        }

    }
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
