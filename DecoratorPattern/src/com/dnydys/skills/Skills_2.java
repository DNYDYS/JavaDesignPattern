package com.dnydys.skills;

import com.dnydys.heros.Hero;

/**
 * @Classname Skills_2
 * @Description 2技能学习
 * @Date 2022/1/9 14:09
 * @Created by hasee
 */
public class Skills_2 extends Skills{

    private String skillName;
    public Skills_2(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了2技能"+skillName);
    }

}
