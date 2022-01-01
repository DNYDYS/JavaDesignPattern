package com.dnydys.criteriaService.impl;

import com.dnydys.criteriaService.Cirteria;
import com.dnydys.model.Persion;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname AndCirteria
 * @Description TODO
 * @Date 2022/1/1 14:58
 * @Created by hasee
 */
public class AndCirteria implements Cirteria {

    private Cirteria cirteria;
    private Cirteria otherCirteria;
    public AndCirteria(Cirteria cirteria,Cirteria otherCirteria) {
        this.cirteria = cirteria;
        this.otherCirteria = otherCirteria;
    }

    @Override
    public List<Persion> meetCirteria(List<Persion> persions) {
        List<Persion> firstCirteriaPersion  = new ArrayList<>();
        return otherCirteria.meetCirteria(firstCirteriaPersion);
    }
}
