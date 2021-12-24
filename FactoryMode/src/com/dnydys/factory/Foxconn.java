package com.dnydys.factory;

import com.dnydys.service.AirPords;
import com.dnydys.service.impl.AirPords2;
import com.dnydys.service.impl.AirPords3;
import com.dnydys.service.impl.AirPordsPro;

/**
 * @Classname Foxconn
 * @Description 富士康工厂
 * @Date 2021/12/23 22:44
 * @Created by hasee
 */
public class Foxconn {

    public AirPords getAirPoreds(String airPordsType){
        if ("".equals(airPordsType)){
            return null;
        }
        if ("airPords2".equals(airPordsType)){
            return new AirPords2();
        }
        if ("airPords3".equals(airPordsType)){
            return new AirPords3();
        }
        if ("airPordsPro".equals(airPordsType)){
            return new AirPordsPro();
        }
        return null;
    }

    /**
     * @className Foxconn
     * @author dnydys
     * @description 使用反射机制可以解决每次增加一个产品时，
     *                  都需要增加一个对象实现工厂的缺点
     * @updateTime 2021/12/24 20:30
     * @return: T
     * @version 1.0
     */
    public static <T> T getClass(Class<? extends T> clazz) {
        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
