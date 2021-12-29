package com.dnydys.houseKeep;

import com.dnydys.abstractClass.HouseKeep;
import com.dnydys.service.Work;

/**
 * @Classname HouseKeep1
 * @Description TODO
 * @Date 2021/12/29 21:46
 * @Created by hasee
 */
public class HouseKeep1 extends HouseKeep {

    public HouseKeep1(Work work) {
        super(work);
    }

    public void manage(){
        System.out.print("管家1指派--");
        super.manage();
    }
}
