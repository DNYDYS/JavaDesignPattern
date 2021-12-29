package com.dnydys;

import com.dnydys.Worker.Worker1;
import com.dnydys.Worker.Worker2;
import com.dnydys.abstractClass.HouseKeep;
import com.dnydys.houseKeep.HouseKeep1;
import com.dnydys.houseKeep.HouseKeep2;

/**
 * @Classname BridgePatternDemo
 * @Description TODO
 * @Date 2021/12/29 21:42
 * @Created by hasee
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        HouseKeep houseKeep = null;

        houseKeep = new HouseKeep1(new Worker1());
        houseKeep.manage();

        houseKeep = new HouseKeep2(new Worker1());
        houseKeep.manage();

        houseKeep = new HouseKeep1(new Worker2());
        houseKeep.manage();

        houseKeep = new HouseKeep2(new Worker2());
        houseKeep.manage();

    }
}
