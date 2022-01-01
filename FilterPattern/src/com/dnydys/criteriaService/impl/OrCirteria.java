package com.dnydys.criteriaService.impl;

import com.dnydys.criteriaService.Cirteria;
import com.dnydys.model.Persion;
import java.util.List;

/**
 * @Classname OrCirteria
 * @Description TODO
 * @Date 2022/1/1 15:03
 * @Created by hasee
 */
public class OrCirteria implements Cirteria {

    private Cirteria cirteria;
    private Cirteria otherCirteria;

    public OrCirteria(Cirteria cirteria, Cirteria otherCirteria) {
        this.cirteria = cirteria;
        this.otherCirteria = otherCirteria;
    }

    @Override
    public List<Persion> meetCirteria(List<Persion> persions) {
        List<Persion> firstCirteriaIteams = cirteria.meetCirteria(persions);
        List<Persion> otherCirteriaIteams = otherCirteria.meetCirteria(persions);
        for (Persion persion: otherCirteriaIteams) {
            if (!firstCirteriaIteams.contains(persion)){
                firstCirteriaIteams.add(persion);
            }
        }
        return firstCirteriaIteams;
    }
}
