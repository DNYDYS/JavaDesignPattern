package com.dnydys;

import com.dnydys.criteriaService.Cirteria;
import com.dnydys.criteriaService.impl.AndCirteria;
import com.dnydys.criteriaService.impl.CirteriaMan;
import com.dnydys.criteriaService.impl.CirteriaSingle;
import com.dnydys.criteriaService.impl.CirteriaWoMan;
import com.dnydys.criteriaService.impl.OrCirteria;
import com.dnydys.model.Persion;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname FilterPatternDemo
 * @Description TODO
 * @Date 2022/1/1 15:35
 * @Created by hasee
 */
public class FilterPatternDemo {

    public static void main(String[] args) {
        List<Persion> persionList = new ArrayList<>();
        persionList.add(new Persion("赵高","man", 36,"Single"));
        persionList.add(new Persion("李斯","man", 50,"married"));
        persionList.add(new Persion("蒙恬","man", 30,"married"));
        persionList.add(new Persion("蒙毅","man", 30,"Single"));
        persionList.add(new Persion("赵姬","woman", 20,"married"));
        persionList.add(new Persion("小月","woman", 20,"single"));

        //获取性别为man的人
        Cirteria cirteriaMan = new CirteriaMan();
        System.out.println("Man:");
        printPersion(cirteriaMan.meetCirteria(persionList));

        //获取性别为woman的人
        Cirteria cirteriaWoman = new CirteriaWoMan();
        System.out.println("Woman:");
        printPersion(cirteriaWoman.meetCirteria(persionList));

        //获取单身狗
        Cirteria cirteriaSingle = new CirteriaSingle();
        System.out.println("单身Dog/：");
        printPersion(cirteriaSingle.meetCirteria(persionList));

        //看参数 获取的是 单身的 或 女人
        Cirteria cireteriaSingleMan = new OrCirteria(cirteriaSingle,cirteriaWoman);
        System.out.println("是单身或者是女人：");
        printPersion(cireteriaSingleMan.meetCirteria(persionList));
    }

    public static void printPersion(List<Persion> persionList ){
        for (Persion persion : persionList) {
            System.out.println("Person:[Name:"+persion.getName()+
                ",Sex:"+persion.getSex()+
                ",Age:"+persion.getAge()+
                ",MaritalStatus:"+persion.getMaritalStatus()+
                "]");
        }
    }
}
