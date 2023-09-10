package Chapter_13_02;

public class Hero {
    // フィールド
    int hp;
    String name;
    Sword sword;

    //メソッド
    public void bye() {
        System.out.println(this.name + "は、別れを告げた");
    }

    public void die() {
        System.out.println(this.name + "は、死んでしまった");
        System.out.println("GAME OVERです。");
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
        System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0) {
            this.die();
        }
    }

    public void setHp(int newHp) {
        this.hp = newHp;

        if (this.hp <= 0) {
            this.die();
        }
    }
}
