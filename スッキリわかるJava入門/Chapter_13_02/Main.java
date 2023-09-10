package Chapter_13_02;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "マサキ";
        h.hp = 50;

        Inn i = new Inn();
        i.name = "宿屋";

        i.checkIn(h); // 宿屋で回復
    }
}
