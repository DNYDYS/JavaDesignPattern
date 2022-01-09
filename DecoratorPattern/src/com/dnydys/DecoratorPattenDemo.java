package com.dnydys;

import com.dnydys.heros.Hero;
import com.dnydys.heros.impl.Magnolia;
import com.dnydys.skills.Skills;
import com.dnydys.skills.Skills_1;
import com.dnydys.skills.Skills_2;
import com.dnydys.skills.Skills_3;

/**
 * @Classname DecoratorPattenDemo
 * @Description demo 召唤师 请选择您的英雄
 * @Date 2022/1/9 13:44
 * @Created by hasee
 */
public class DecoratorPattenDemo {

    public static void main(String[] args) {
        //选择英雄花木兰
        Hero hero = new Magnolia("花木兰");

        Skills skills = new Skills(hero);
        Skills_1 skills1 = new Skills_1(hero, "空裂斩");
        Skills_2 skills2 = new Skills_2(hero, "旋舞之华");
        Skills_3 skills3 = new Skills_3(hero, "绽放刀锋");
        skills.learnSkills();
        skills1.learnSkills();
        skills2.learnSkills();
        skills3.learnSkills();
    }
}
