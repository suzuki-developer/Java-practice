package Chapter_09_04.practice_02;

public class Main {
  // hpを10回復する
  public static void heal(int hp) {
    hp += 10;
  }

  // シーフクラスのhpを10回復する
  public static void heal(Thief thief) {
    thief.hp += 10;
  }
  public static void main(String[] args) {
    int baseHp = 25;
    Thief t = new Thief("アサカ", baseHp); // シーフクラスのインスタンスを作成

    heal(baseHp); // HPを25 + 10 する（ = 35 ）
    System.out.println(baseHp + " : " + t.hp);
    
    heal(t);
    System.out.println(baseHp + " : " + t.hp);
  }
}

/*
練習 9-2 
・プログラムの実行結果
    25 : 25
    25 : 35

・表示される理由（「参照」という言葉を使用して説明する）    

 */