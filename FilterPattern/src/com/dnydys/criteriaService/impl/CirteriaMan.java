package com.dnydys.criteriaService.impl;

import com.dnydys.criteriaService.Cirteria;
import com.dnydys.model.Persion;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CirteriaMan
 * @Description TODO
 * @Date 2022/1/1 14:34
 * @Created by hasee
 */
public class CirteriaMan implements Cirteria {

    @Override
    public List<Persion> meetCirteria(List<Persion> persions) {
        List<Persion> persionMan = new ArrayList<>();
        for (Persion persion: persions) {
            if ("Man".equalsIgnoreCase(persion.getSex())){
                persionMan.add(persion);
            }
        }
        return persionMan;
    }
}
