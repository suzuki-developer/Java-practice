package Chapter_13_13;

public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    // getterメソッド
    public String getName() {
        return this.name;
    }

    // setterメソッド
    public void setName(String name) {
        // バリデーションチェック
        if (name == null) {
            throw new IllegalArgumentException("名前がNULLのため、処理を中断しました");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎるため、処理を中断しました");            
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎるため、処理を中断しました");                
        }
        this.name = name;
    }

    void bye() {
        System.out.println(this.name + "は、別れを告げた");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した");
    }

    private void die() {
        System.out.println(this.name + "は、死んでしまった");
        System.out.println("GAME OVER");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の、攻撃");
        System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0) {
            this.die();
        }
    }

}
