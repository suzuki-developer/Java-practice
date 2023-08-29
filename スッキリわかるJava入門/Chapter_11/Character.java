package Chapter_11;

// 抽象クラス
public abstract class Character {
    String name;
    int hp;

    public void run() {
        System.out.println(this.name + "は、逃げだした");
    }
    // 抽象メソッド
    public abstract void attack(Matango m);
}
