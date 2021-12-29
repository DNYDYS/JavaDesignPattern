package com.dnydys.Worker;

import com.dnydys.service.Work;

/**
 * @Classname Worker1
 * @Description TODO
 * @Date 2021/12/29 21:49
 * @Created by hasee
 */
public class Worker1 implements Work {

    @Override
    public void work() {
        System.out.println("工人1工作");
    }
}
