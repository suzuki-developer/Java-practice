package Chapter_08_06;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp = 10;
    final int MAXMP = 10;

    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた");
        this.mp -= 5;
        this.hp = MAXHP;
        System.out.println(this.name + "のHPが最大値まで回復した");        
    }

    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒祈りを捧げた");

        // 祈った秒数（sec）+ 0 ~ 2 の数値分、自分のhpを回復する
        Random rand = new Random();
        int result = rand.nextInt(3) + sec;

        // 現在のmpに回復量を足す
        int resultnum = this.mp += result;
        
        System.out.println(this.name + "のHPが" + resultnum + "回復した");
        return resultnum;
        // 
    }
}
/*
参考サイト
Javaで指定範囲の乱数を生成する：Random.nextInt()
https://uxmilk.jp/47989

以下、引用
nextInt() は 0 から引数に指定した値未満の整数を返します。

import java.util.Random;
class Sample {
  public static void main(String args[]) {
    Random rand = new Random();
    int num = rand.nextInt(10) + 100;
    System.out.println(num);
  }
}
1
2
3
4
5
6
7
8
import java.util.Random;
class Sample {
  public static void main(String args[]) {
    Random rand = new Random();
    int num = rand.nextInt(10) + 100;
    System.out.println(num);
  }
} 
*/