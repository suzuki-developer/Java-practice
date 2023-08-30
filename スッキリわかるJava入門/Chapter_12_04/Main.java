package Chapter_12_04;

public class Main {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Matango m = new Matango();

        w.name = "アサカ";
        w.attack(m);
        w.fireball(m);

        Character c = new Wizard();
        c.name = "キャラクター";
        c.attack(m);
        c.fireball(m);
        /*
         * メソッド fireball(Matango) は CharacterJava(67108964) 型では未定義です。
         */
    }
}
