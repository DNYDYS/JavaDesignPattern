package com.dnydys.skills;

import com.dnydys.heros.Hero;

/**
 * @Classname Skills_1
 * @Description 1技能学习
 * @Date 2022/1/9 14:05
 * @Created by hasee
 */
public class Skills_1 extends Skills{

    private String skillName;
    public Skills_1(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }
    public void learnSkills(){
        System.out.println("学习了1技能"+skillName);
    }
}
