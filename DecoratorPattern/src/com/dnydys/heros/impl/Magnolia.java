package com.dnydys.heros.impl;

import com.dnydys.heros.Hero;

/**
 * @Classname Magnolia
 * @Description ConcreteComponent 具体英雄花木兰
 * @Date 2022/1/9 13:50
 * @Created by hasee
 */
public class Magnolia implements Hero {

    private String name;

    public Magnolia(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name+"学习了技能");
    }
}
