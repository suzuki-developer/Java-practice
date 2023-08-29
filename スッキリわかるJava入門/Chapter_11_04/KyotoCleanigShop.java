package Chapter_11_04;

public class KyotoCleanigShop implements CleanigService {
    String owername;
    String addess;
    String phone;
    
    public Shirt washShirt(Shirt s) {
        return s;
    }
    public Towl washTowl(Towl t) {
        return t;
    }
    public Coat washCoat(Coat c) {
        return c;
    }
}
