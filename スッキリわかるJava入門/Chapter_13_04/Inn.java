package Chapter_13_04;

public class Inn {
    String name;

    public void checkIn(Hero h) {
        // 勇者のHPフィールドを直接変更できないため、sleep()メソッドを使用
        h.sleep();   
        System.out.println(h.name + "は宿で休んで体力を回復した");
    }
}
