package Chapter_06_08.comment;

public class Kouhan {
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }
    public static void showMondokoro() throws Exception {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        Thread.sleep(3000);
        Zenhan.doTogame();    // もう一度、とがめる
    }
}

/*
 * java.lang.Thred の使い方は下記を参考に使用
 * 【Java入門】Threadをsleepメソッドで一定時間停止する方法
 * https://www.sejuku.net/blog/21767
 */
 
