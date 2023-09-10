package Chapter_13_02;

public class Inn {
    String name;

    public void checkIn(Hero h) {
        h.hp = -100;
        System.out.println(h.name + "は宿で休んで体力を回復した");
        h.setHp(h.hp);
    }
}
