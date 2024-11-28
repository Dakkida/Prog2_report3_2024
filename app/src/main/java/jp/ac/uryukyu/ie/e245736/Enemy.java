package jp.ac.uryukyu.ie.e245736;

public class Enemy extends LivingThing{

    //基底クラスのコンストラクトを引数ありで呼び出す
    public Enemy(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage){
        int hitPoint = getHitPoint();
        hitPoint -= damage;
        hitPointDec(hitPoint);
        if(hitPoint <= 0) {
            deadTrue(true);
            System.out.printf("モンスター%sは倒れた。", getName());
        }
    }
}