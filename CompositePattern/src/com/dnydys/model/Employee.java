package com.dnydys.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Employee
 * @Description TODO
 * @Date 2022/1/2 12:47
 * @Created by hasee
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> suboridinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        suboridinates = new ArrayList<Employee>();
    }

    public void add(Employee e){
        suboridinates.add(e);
    }

    public void remove(Employee e){
        suboridinates.remove(e);
    }

    public List<Employee> getSuboridinates(){
        return suboridinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", dept='" + dept + '\'' +
            ", salary=" + salary +
            '}';
    }
}
