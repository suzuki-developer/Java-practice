package Chapter_11_06;

public abstract class TangibleAsset {
    // フィールド
    String name;
    int price;
    String color;
    String isbn;

    // コンストラクタ
    public TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }
    // メソッド
    public String getName() { 
        return this.name; 
    }
    public int getPrice() { 
        return this.price; 
    }
    public String getColor() { 
        return this.color; 
    }
}
