package com.dnydys.model;

import com.dnydys.AbstractClass.AllCarInfo;

/**
 * @Classname GTRInfo
 * @Description TODO
 * @Date 2021/12/27 21:04
 * @Created by hasee
 */
public class GTRInfo extends AllCarInfo {

    private String cID;
    private String cName;
    private String ctype;
    private float price;
    @Override
    public String mySay() {
        return ("My dad has a GTR");
    }

    @Override
    public String getcID() {
        return cID;
    }

    @Override
    public void setcID(String cID) {
        this.cID = cID;
    }

    @Override
    public String getcName() {
        return cName;
    }

    @Override
    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String getCtype() {
        return ctype;
    }

    @Override
    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
