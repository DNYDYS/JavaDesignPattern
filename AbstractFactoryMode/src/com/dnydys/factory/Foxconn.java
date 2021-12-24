package com.dnydys.factory;

import com.dnydys.abstractFactory.AbstractFaxconn;
import com.dnydys.airPords.AirPords;
import com.dnydys.airPords.impl.AirPords2;
import com.dnydys.airPords.impl.AirPords3;
import com.dnydys.airPords.impl.AirPordsPro;
import com.dnydys.phone.IPhone;
import com.dnydys.phone.impl.IPhone13Pro;
import com.dnydys.phone.impl.IPhone13ProMAX;
import com.dnydys.phone.impl.Iphone13;

/**
 * @Classname Foxconn
 * @Description 富士康工厂
 * @Date 2021/12/23 22:44
 * @Created by hasee
 */
public class Foxconn extends AbstractFaxconn {

    @Override
    public AirPords getAirPords(String airpords) {
        switch (airpords){
            case "airPords2":
                return new AirPords2();
            case "airPords3":
                return new AirPords3();
            case "airPordsPro":
                return new AirPordsPro();
            default:
                return null;
        }

    }

    @Override
    public IPhone getIphone(String iPhone) {
        switch (iPhone){
            case "iPhone13":
                return new Iphone13();
            case "iPhone13Pro":
                return new IPhone13Pro();
            case "iPhone13ProMAX":
                return new IPhone13ProMAX();
            default:
                return null;
        }
    }
}
