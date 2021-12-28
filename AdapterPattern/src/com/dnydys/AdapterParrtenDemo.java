package com.dnydys;

import com.dnydys.service.impl.AudioPlayer;

/**
 * @Classname AdapterParrtenDemo
 * @Description TODO
 * @Date 2021/12/28 21:24
 * @Created by hasee
 */
public class AdapterParrtenDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("Mp3","逝去日子.mp3");
        audioPlayer.play("mP4","江南.MP4");
        audioPlayer.play("aiQIYI","光年之外.aiqiyi");
        audioPlayer.play("Mp5","苍井空");
    }
}
