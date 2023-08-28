package Chapter_10_03;

public class SuperHero extends Hero{
    // フィールドの追加
    String name = "スーパーミナト";    
    int hp = 200;
    boolean flying;

    // メソッドの追加
    public void fly() {
        this.flying = true;
        System.out.println(this.name + "は、飛び上がった");
    }
    public void land() {
        this.flying = false;
        System.out.println(this.name + "は、着地した");
    }
    // オーバーライド
    public void run() {
        System.out.println(this.name + "は、撤退した");
    }
    public void attack(Matango m) {
        // 親クラスのattack()を呼び出す
        super.attack(m);
        if (this.flying) {
            System.out.println(this.name + "の、追加攻撃");
            super.attack(m);
        }
    }

    // コンストラクタ
    public SuperHero() {
        // 親コンストラクタの呼び出し（通常は省略）
        super();
        System.out.println("SuperHeroのコンストラクタが動作しました");
    }
}

