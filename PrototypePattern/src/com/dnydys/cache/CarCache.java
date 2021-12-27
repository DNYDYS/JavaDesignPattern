package com.dnydys.cache;

import com.dnydys.AbstractClass.AllCarInfo;
import com.dnydys.model.AudiInfo;
import com.dnydys.model.BMWInfo;
import com.dnydys.model.GTRInfo;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname CarCache
 * @Description TODO
 * @Date 2021/12/27 21:06
 * @Created by hasee
 */
public class CarCache {

    public static HashMap<String, AllCarInfo> allCarInfoMap = new HashMap<>();

    public static AllCarInfo getCars(String cid){
        AllCarInfo allCarInfo = allCarInfoMap.get(cid);
        return (AllCarInfo) allCarInfo.clone();
    }

    public static void loadCache(){
        AudiInfo audiInfo = new AudiInfo();
        audiInfo.setcID("Audi");
        allCarInfoMap.put(audiInfo.getcID(),audiInfo);

        BMWInfo bmwInfo = new BMWInfo();
        bmwInfo.setcID("BMW");
        allCarInfoMap.put(bmwInfo.getcID(), bmwInfo);

        GTRInfo gtrInfo = new GTRInfo();
        gtrInfo.setcID("GTR");
        allCarInfoMap.put(gtrInfo.getcID(), gtrInfo);
    }
}
