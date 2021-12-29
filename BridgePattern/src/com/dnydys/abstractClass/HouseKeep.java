package com.dnydys.abstractClass;

import com.dnydys.service.Work;

/**
 * @Classname HouseKeep
 * @Description TODO
 * @Date 2021/12/29 21:43
 * @Created by hasee
 */
public abstract class HouseKeep {

    protected Work work ;

    public HouseKeep (Work work){
        this.work = work;
    }

    public void manage(){
        this.work.work();
    }
}
