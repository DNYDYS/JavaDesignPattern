package com.dnydys.service.impl;

import com.dnydys.service.MediaPlay;
import com.dnydys.service.impl.MediaAdapter;

/**
 * @Classname AudioPlayer
 * @Description TODO
 * @Date 2021/12/28 21:18
 * @Created by hasee
 */
public class AudioPlayer implements MediaPlay {

    @Override
    public void play(String audioType, String fileName) {
        MediaAdapter mediaAdapter = new MediaAdapter();
        if ("mp3".equalsIgnoreCase(audioType)){
            System.out.println("MP3直接在这里播放哦，当前播放"+fileName);
        }else if("Mp4".equalsIgnoreCase(audioType)|| "aiqiyi".equalsIgnoreCase(audioType)){
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("暴风影音请悄咪咪的，别在这里声张哦"+fileName);
        }
    }
}
