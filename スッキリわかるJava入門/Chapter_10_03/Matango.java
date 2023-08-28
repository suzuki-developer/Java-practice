package Chapter_10_03;

public class Matango {
    // フィールド
    int hp;
    final int LEVEL = 10;
    char suffix;

    // メソッド
    public void hello() {
        System.out.println("お化けキノコ" + this.suffix + "が現れた");
    }

    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した");
    }

    // コンストラクタ
    public Matango() {
        this.hp = 10;
        this.suffix = 'A';
    }
}
