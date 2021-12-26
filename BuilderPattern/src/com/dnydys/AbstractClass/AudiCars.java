package com.dnydys.AbstractClass;

import com.dnydys.service.Assemble;
import com.dnydys.service.AudiItems;
import com.dnydys.service.impl.AudiCar;

/**
 * @Classname AudiCars
 * @Description TODO
 * @Date 2021/12/26 11:33
 * @Created by hasee
 */
public abstract class AudiCars implements AudiItems {

    //组装汽车
    @Override
    public Assemble assembling(){
        return new AudiCar();
    }

    @Override
    public abstract float price();
}
