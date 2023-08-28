package Chapter_10;

// 継承不可
public final class Main {
    public static void main(String[] args) {
        System.out.println("=====お化けキノコの行動=====");
        Matango a = new Matango();
        a.hello();

        System.out.println("=====ヒーローの行動=====");
        Hero h = new Hero();
        h.attack(a);
        h.slip();
        h.run();

        System.out.println("=====スーパーヒーローの行動=====");
        SuperHero sh = new SuperHero();
        sh.fly();
        sh.attack(a);
        sh.land();
        sh.run();
    }
}
