package Chapter_13_04;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "マサキ";

        Inn i = new Inn();
        i.name = "宿屋";

        i.checkIn(h); // 宿屋で回復
    }
}
