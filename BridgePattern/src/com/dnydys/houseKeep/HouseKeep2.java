package com.dnydys.houseKeep;

import com.dnydys.abstractClass.HouseKeep;
import com.dnydys.service.Work;

/**
 * @Classname HouseKeep2
 * @Description TODO
 * @Date 2021/12/29 21:48
 * @Created by hasee
 */
public class HouseKeep2 extends HouseKeep {

    public HouseKeep2(Work work) {
        super(work);
    }

    public void manage(){
        System.out.print("管家2指派--");
        super.manage();
    }
}
