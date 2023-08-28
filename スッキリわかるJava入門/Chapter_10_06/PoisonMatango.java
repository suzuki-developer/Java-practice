package Chapter_10_06;

public class PoisonMatango extends Matango {
    int RemainingCount = 5; // 毒攻撃の可能回数
    
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    
    public void attack(Hero h) {
        super.attack(h);
        if (RemainingCount != 0) {
            System.out.println("さらに毒の胞子をばらまいた");
            int poisonDamage = h.hp / 5;
            h.hp -= poisonDamage;
            System.out.println(poisonDamage + "ポイントのダメージ");
            RemainingCount -=1;
        }
    }
}
