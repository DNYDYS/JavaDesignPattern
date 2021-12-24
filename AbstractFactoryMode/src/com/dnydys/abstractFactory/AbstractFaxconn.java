package com.dnydys.abstractFactory;

import com.dnydys.airPords.AirPords;
import com.dnydys.phone.IPhone;

/**
 * @Classname AbstractFaxconn
 * @Description TODO
 * @Date 2021/12/24 21:59
 * @Created by hasee
 */
public abstract class AbstractFaxconn {

    public abstract AirPords getAirPords(String airpords);
    public abstract IPhone getIphone(String iPhone);
}
