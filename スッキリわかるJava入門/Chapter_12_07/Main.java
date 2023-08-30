package Chapter_12_07;

public class Main {
    public static void main(String[] args) {
        // キャラクター型の配列を作成
        Character[] c = new Character[5];
        c[0] = new Hero();
        c[1] = new Hero();
        c[2] = new Thief();
        c[3] = new Wizard();
        c[4] = new Wizard();

        // キャラクターの名前をセット
        c[0].name = "勇者1";
        c[1].name = "勇者2";
        c[2].name = "盗賊";
        c[3].name = "魔法使い1";
        c[4].name = "魔法使い2";

        // 宿屋に泊まる
        for (Character ch : c) {
            ch.hp += 50;
            System.out.println(ch.name + "のHPを回復した。");
        }
    }
}
