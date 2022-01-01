package com.dnydys.criteriaService.impl;

import com.dnydys.criteriaService.Cirteria;
import com.dnydys.model.Persion;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CirteriaWoMan
 * @Description TODO
 * @Date 2022/1/1 14:38
 * @Created by hasee
 */
public class CirteriaWoMan implements Cirteria {

    @Override
    public List<Persion> meetCirteria(List<Persion> persions) {
        List<Persion> persionWoMan = new ArrayList<>();
        for (Persion persion: persions) {
            if ("woman".equalsIgnoreCase(persion.getSex())){
                persionWoMan.add(persion);
            }
        }
        return persionWoMan;
    }
}
