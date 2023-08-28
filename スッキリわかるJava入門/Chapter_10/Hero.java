package Chapter_10;

public class Hero {
    // フィールドを定義
    String name;    
    int hp;

    // メソッドを定義
    // 戦う
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
        m.hp -= 10;
        System.out.println("お化けキノコ" + m.suffix + "に10ポイントのダメージを与えた");
    }

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }

    // 継承不可のメソッド
    // 転ぶ
    public void slip() {
        System.out.println(this.name + "は転んだ");
    }

    // コンストラクタ
    public Hero() {
        this.name = "ヒーロー";
        this.hp = 100;
    }
}
