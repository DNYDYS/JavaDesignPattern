package com.dnydys.skills;

import com.dnydys.heros.Hero;

/**
 * @Classname Skills
 * @Description 技能栏
 * @Date 2022/1/9 14:01
 * @Created by hasee
 */
public class Skills implements Hero {

    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if (hero!=null){
            hero.learnSkills();
        }
    }
}
