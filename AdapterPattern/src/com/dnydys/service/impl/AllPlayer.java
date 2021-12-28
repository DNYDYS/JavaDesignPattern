package com.dnydys.service.impl;


import com.dnydys.service.AdvanceMediaPlay;

/**
 * @Classname AllPlayer
 * @Description TODO
 * @Date 2021/12/28 21:02
 * @Created by hasee
 */
public class AllPlayer implements AdvanceMediaPlay {

    @Override
    public void mp4Player(String fileName) {
        System.out.println("我是Mp4，当前正在播放"+ fileName);
    }

    @Override
    public void aiQiYiPlayer(String fileName) {
        System.out.println("我是爱奇艺，当前正在播放"+fileName);
    }
}
