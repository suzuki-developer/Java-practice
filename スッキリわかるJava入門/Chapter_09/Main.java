package Chapter_09;

public class Main {
    public static void main(String[] args) {
        Sword s1 = new Sword();
        s1.name = "炎の剣";
        s1.damage = 10;

        Sword s2 = new Sword();
        s2.name = "青の剣";
        s2.damage = 20;
        
        Hero h1 = new Hero();
        h1.name = "ミナト";
        h1.hp = 100;
        h1.sword = s1;
        System.out.println(h1.name + "は" + h1.sword.name + "を装備している");

        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 200;
        h2.sword = s2;
        System.out.println(h2.name + "は" + h2.sword.name + "を装備している");

        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 300;

        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
    }
}
