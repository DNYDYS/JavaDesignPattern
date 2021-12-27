package com.dnydys;

import com.dnydys.cache.CarCache;
import com.dnydys.model.AudiInfo;
import com.dnydys.model.BMWInfo;
import com.dnydys.model.GTRInfo;

/**
 * @Classname PrototypePatternDemo
 * @Description TODO
 * @Date 2021/12/27 20:52
 * @Created by hasee
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        CarCache.loadCache();
        AudiInfo audi = (AudiInfo)CarCache.getCars("Audi");
        System.out.println(audi.mySay());

        BMWInfo bmw = (BMWInfo)CarCache.getCars("BMW");
        System.out.println(bmw.mySay());

        GTRInfo gtr = (GTRInfo)CarCache.getCars("GTR");
        System.out.println(gtr.mySay());
    }

}
