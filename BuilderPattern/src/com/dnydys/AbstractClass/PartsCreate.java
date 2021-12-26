package com.dnydys.AbstractClass;

import com.dnydys.service.Assemble;
import com.dnydys.service.AudiItems;
import com.dnydys.service.impl.Parts;

/**
 * @Classname PartsCreate
 * @Description TODO
 * @Date 2021/12/26 11:22
 * @Created by hasee
 */
public abstract class PartsCreate implements AudiItems {

    //组装配件
    @Override
    public Assemble assembling(){
        return new Parts();
    }

    @Override
    public abstract float price();

}
