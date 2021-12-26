package com.dnydys;

import com.dnydys.ACompleteSet.Complete;
import com.dnydys.ACompleteSet.CompleteBuilder;

/**
 * @Classname BuilderPatternDemo
 * @Description TODO
 * @Date 2021/12/26 12:23
 * @Created by hasee
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        CompleteBuilder completeBuilder = new CompleteBuilder();
        Complete complete = completeBuilder.prepareA7();
        System.out.println(" A7 ");
        complete.showAudiItems();
        System.out.println("A7价格："+complete.allPrice());
        System.out.println("________________________________________________________________________");
        Complete completeRS7 = completeBuilder.prepareRS7();
        System.out.println("RS7");
        completeRS7.showAudiItems();
        System.out.println("RS7价格"+completeRS7.allPrice());
    }



}
