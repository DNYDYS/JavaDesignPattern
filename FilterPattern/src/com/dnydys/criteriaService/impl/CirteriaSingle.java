package com.dnydys.criteriaService.impl;

import com.dnydys.criteriaService.Cirteria;
import com.dnydys.model.Persion;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname CirteriaSingle
 * @Description TODO
 * @Date 2022/1/1 15:30
 * @Created by hasee
 */
public class CirteriaSingle implements Cirteria {

    @Override
    public List<Persion> meetCirteria(List<Persion> persions) {
        List<Persion> persionSingle = new ArrayList<>();
        for (Persion persion : persions) {
            if ("single".equalsIgnoreCase(persion.getMaritalStatus())){
                persionSingle.add(persion);
            }
        }
        return persionSingle;
    }
}
