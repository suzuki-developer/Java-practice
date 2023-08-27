package Chapter_09_02;

// Heroクラス
public class Hero {
    // 属性
    String name;
    int hp;
    Sword sword;

    // コンストラクタ（引数あり）
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    // コンストラクタ（引数なし）
    public Hero() {
        this("ダミー");
    }

    // 操作
    public void attack() {
        System.out.println(this.name + "は、攻撃した");
        System.out.println("敵に5ポイントのダメージを与えた");
    }
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した");
    }
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は転んだ");
        System.out.println("5のダメージ");
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した");
        System.out.println("GAME OVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
