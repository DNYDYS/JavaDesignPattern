package com.dnydys;

import com.dnydys.factory.Foxconn;
import com.dnydys.service.AirPords;

/**
 * @Classname main
 * @Description TODO
 * @Date 2021/12/23 22:48
 * @Created by hasee
 */
public class main {

    public static void main(String[] args) {
        Foxconn foxconn = new Foxconn();
        //2代耳机
        AirPords airPoreds2 = foxconn.getAirPoreds("airPords2");
        airPoreds2.createAirPords();
        //3代耳机
        AirPords airPoreds3 = foxconn.getAirPoreds("airPords3");
        airPoreds3.createAirPords();
        //pro
        AirPords airPoredsPro = foxconn.getAirPoreds("airPordsPro");
        airPoredsPro.createAirPords();
    }
    
    /**
     * @className main
     * @author dnydys
     * @description 使用反射机制可以解决每次增加一个产品时，
     *                   都需要增加一个对象实现工厂的缺点
     * @updateTime 2021/12/24 20:36 
     * @return: void
     * @version 1.0
     */
//    public static void main(String[] args) {
//        Foxconn foxconn = new Foxconn();
//        AirPords2 airPords2 = foxconn.getClass(AirPords2.class);
//        airPords2.createAirPords();
//
//        AirPords3 airPords3 = foxconn.getClass(AirPords3.class);
//        airPords3.createAirPords();
//
//        AirPordsPro airPordsPro = foxconn.getClass(AirPordsPro.class);
//        airPordsPro.createAirPords();
//
//    }

}
