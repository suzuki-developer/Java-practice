package Chapter_12_07;

public abstract class Character {
    String name;
    int hp;

    public void run() {
        System.out.println(this.name + "は、逃げ出した");
    }

    public abstract void attack(Matango m);
}
