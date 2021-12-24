package com.dnydys.factory;

import com.dnydys.abstractFactory.AbstractFaxconn;

/**
 * @Classname FactoryProducer
 * @Description TODO
 * @Date 2021/12/24 23:03
 * @Created by hasee
 */
public class FactoryProducer {

    public static AbstractFaxconn getFactory(String factoryName){
        switch (factoryName){
            case "AirPords":
                return new Foxconn();
            case "IPhone":
                return new Foxconn();
            default:
                return null;
        }
    }

}
