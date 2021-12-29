package com.dnydys.Worker;

import com.dnydys.service.Work;

/**
 * @Classname Worker2
 * @Description TODO
 * @Date 2021/12/29 21:50
 * @Created by hasee
 */
public class Worker2 implements Work {

    @Override
    public void work() {
        System.out.println("工人2工作");
    }
}
