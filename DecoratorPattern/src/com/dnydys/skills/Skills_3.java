package com.dnydys.skills;

import com.dnydys.heros.Hero;

/**
 * @Classname Skills_3
 * @Description 3技能学习
 * @Date 2022/1/9 14:11
 * @Created by hasee
 */
public class Skills_3  extends Skills{

    private String skillName;
    public Skills_3(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    public void learnSkills(){
        System.out.println("学习了3技能"+skillName);
    }
}
