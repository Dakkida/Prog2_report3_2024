package jp.ac.uryukyu.ie.e245736;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    
    @Test
    void attackWithWeponSkillTest() {
        int defaultHeroHp;
        Warrior demoWarrior = new Warrior("デモスーパー勇者", 100, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int count=0; count<3; count++){
            defaultHeroHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime); 
            assertEquals(demoWarrior.getAttack() * 1.5, defaultHeroHp - slime.getHitPoint());
        }
    }
}
