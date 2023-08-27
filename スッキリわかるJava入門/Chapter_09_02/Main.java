package Chapter_09_02;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト");
        System.out.println("プレイヤーの名前：" + h.name);
        System.out.println("プレイヤーの初期HP：" + h.hp);

        Hero h2 = new Hero();
        System.out.println("プレイヤーの名前：" + h2.name);
        System.out.println("プレイヤーの初期HP：" + h2.hp); 
    }
}
