package com.dnydys;

import com.dnydys.abstractFactory.AbstractFaxconn;
import com.dnydys.factory.FactoryProducer;
import com.dnydys.factory.Foxconn;
import com.dnydys.airPords.AirPords;
import com.dnydys.phone.IPhone;

/**
 * @Classname main
 * @Description TODO
 * @Date 2021/12/23 22:48
 * @Created by hasee
 */
public class main {

    public static void main(String[] args) {

//        AbstractFaxconn airPords = FactoryProducer.getFactory("AirPords");
//        airPords.getAirPords("airPords2").createAirPords();
        Foxconn foxconn = new Foxconn();
        //2代耳机
        AirPords airPoreds2 = foxconn.getAirPords("airPords2");
        airPoreds2.createAirPords();
        //3代耳机
        AirPords airPoreds3 = foxconn.getAirPords("airPords3");
        airPoreds3.createAirPords();
        //pro
        AirPords airPoredsPro = foxconn.getAirPords("airPordsPro");
        airPoredsPro.createAirPords();

        IPhone iPhone13 = foxconn.getIphone("iPhone13");
        iPhone13.createIPhone();

        IPhone iPhone13Pro = foxconn.getIphone("iPhone13Pro");
        iPhone13Pro.createIPhone();

        IPhone iPhone13ProMAX = foxconn.getIphone("iPhone13ProMAX");
        iPhone13ProMAX.createIPhone();

    }

}
