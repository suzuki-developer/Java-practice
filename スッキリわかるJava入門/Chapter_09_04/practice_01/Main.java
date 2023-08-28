package Chapter_09_04.practice_01;

public class Main {
  public static void main(String[] args) {
    System.out.println("======動作確認・開始======");

    Thief test1 = new Thief("オーキド", 50, 15);
    Thief test2 = new Thief("ロマンス", 35);
    Thief test3 = new Thief("アサカ");

    System.out.println("テスト1の名前：" + test1.name + "HP：" + test1.hp + "MP：" +test1.mp);
    System.out.println("テスト2の名前：" + test2.name + "HP：" + test2.hp + "MP：" +test2.mp);
    System.out.println("テスト3の名前：" + test3.name + "HP：" + test3.hp + "MP：" +test3.mp);

    System.out.println("======動作確認・終了======");
  }
}
