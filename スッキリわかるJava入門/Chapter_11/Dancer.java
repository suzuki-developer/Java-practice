package Chapter_11;

public class Dancer extends Character {
    public void dance() {
        System.out.println(this.name + "は、情熱的に踊った");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("お化けキノコ" + m.suffix + "に10ダメージ");
        m.hp -= 10;
    }
}
