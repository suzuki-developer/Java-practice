package Chapter_08;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========インスタンス生成開始=========");
        // =======================
        // 勇者のインスタンスを作成
        // =======================
        Hero h = new Hero();

        // 属性（フィールド）に初期値をセット
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました");

        // ==============================
        // お化けクラスのインスタンスを作成
        // ==============================
        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';
        System.out.println("お化けキノコ" + m1.suffix + "を生み出しました");

        Matango m2 = new Matango();
        m2.hp = 70;
        m2.suffix = 'B';
        System.out.println("お化けキノコ" + m2.suffix + "を生み出しました");

        System.out.println("=========インスタンス生成完了=========");

        // ============
        // 冒険スタート
        // ============
        System.out.println("=========冒険開始=========");
        h.slip(); // 勇者は転ぶ
        m1.run(); // お化けキノコAが逃げる
        m2.run(); // お化けキノコBも逃げる
        h.run();  // 勇者も逃げる
    }
}
