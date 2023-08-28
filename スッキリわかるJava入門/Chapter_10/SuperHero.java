package Chapter_10;

public class SuperHero extends Hero{
    // フィールドの追加
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
        // System.out.println(this.name + "の、攻撃");
        // m.hp -= 5;
        // System.out.println("お化けキノコ" + m.suffix + "に5ポイントのダメージを与えた");
        // if (this.flying) {
        //     System.out.println(this.name + "の、追加攻撃");
        //     m.hp -= 5;
        //     System.out.println("お化けキノコ" + m.suffix + "に5ポイントのダメージを与えた");
        // }

        // 親クラスのattack()を呼び出す
        super.attack(m);
        if (this.flying) {
            System.out.println(this.name + "の、追加攻撃");
            super.attack(m);
        }
    }

    // コンストラクタ
    public SuperHero() {
        this.name = "スーパーヒーロー";
        this.hp = 200;
        this.flying = false;
    }
}

