package jp.ac.uryukyu.ie.e245736;

public class Warrior extends LivingThing {

    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (this.isDead() != true) {
            int damage = (int)(1.5 * super.getAttack());
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", super.getName(), opponent.getName(), damage);
            opponent.wounded(damage);
            }
    }
}
