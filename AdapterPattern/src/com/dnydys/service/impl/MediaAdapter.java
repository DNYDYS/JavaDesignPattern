package com.dnydys.service.impl;

import com.dnydys.service.MediaPlay;
import com.dnydys.service.impl.AllPlayer;
import javax.annotation.Resource;

/**
 * @Classname MediaAdapter
 * @Description 适配器
 * @Date 2021/12/28 21:10
 * @Created by hasee
 */
public class MediaAdapter implements MediaPlay {



    @Override
    public void play(String audioType, String fileName) {
        AllPlayer allPlayer = new AllPlayer();
        if ("aiqiyi".equalsIgnoreCase(audioType)){
            allPlayer.aiQiYiPlayer(fileName);
        }else if ("Mp4".equalsIgnoreCase(audioType)){
            allPlayer.mp4Player(fileName);
        }
    }
}
