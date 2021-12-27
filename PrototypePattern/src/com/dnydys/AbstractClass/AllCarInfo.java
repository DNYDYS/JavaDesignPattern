package com.dnydys.AbstractClass;

/**
 * @Classname AllCarInfo
 * @Description TODO
 * @Date 2021/12/27 20:45
 * @Created by hasee
 */
public abstract class AllCarInfo implements Cloneable{

    protected String cID;
    protected String cName;
    protected String ctype;

    protected abstract String mySay();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }
}
