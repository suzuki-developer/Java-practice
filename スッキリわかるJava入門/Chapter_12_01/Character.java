package Chapter_12_01;

public abstract class Character implements Life {
    // フィールド
    String name;
    int hp;

    // メソッド
    public void run() {
        System.out.println(this.name + "は、逃げ出した");
    }

    // 抽象メソッド
    public abstract void attack(Matango m);
}
