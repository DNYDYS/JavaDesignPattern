package com.dnydys;

import com.dnydys.model.Employee;

/**
 * @Classname CompositePatternDemo
 * @Description TODO
 * @Date 2022/1/2 12:46
 * @Created by hasee
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("罗老师","CEO",30000);

        Employee hadeSales = new Employee("张三","销售部经理",20000);

        Employee CTO = new Employee("李四","CTO",50000);

        Employee javaEngineer1  = new Employee("王五","Java Engineer",30000);
        Employee javaEngineer2  = new Employee("赵六","Java Engineer",22000);

        Employee sale1 = new Employee("销售员1","销售部",12000);
        Employee sale2 = new Employee("销售员2","销售部",13000);

        CEO.add(hadeSales);
        CEO.add(CTO);

        hadeSales.add(sale1);
        hadeSales.add(sale2);

        CTO.add(javaEngineer1);
        CTO.add(javaEngineer2);

        System.out.println(CEO);

        for (Employee e: CEO.getSuboridinates()) {
            System.out.println(e);
            for (Employee e1:e.getSuboridinates()) {
                System.out.println(e1);
            }
        }
    }
}
