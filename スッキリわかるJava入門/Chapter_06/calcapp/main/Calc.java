// 所属パッケージ名
package Chapter_06.calcapp.main;

import Chapter_06.calcapp.logics.CalcLogic;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        
        // -----------------------------------
        // CalcLogicクラス内のメソッドを呼び出す
        // -----------------------------------        
        // FQCN = <1行目に書いてある所属パッケージ名>.<メソッド名>
        int total = Chapter_06.calcapp.logics.CalcLogic.tasu(a, b);

        // インポート（FQCNの省略）した場合
        int delta = CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "引くと" + delta);
    }
}

/*
 * コンパイル文
 * javac -encoding UTF-8 -cp ./ Chapter_06/calcapp/main/Calc.java
 * 上記を実行することで、CalcLogic.javaも同時にコンパイルされる
 */

