package by.teachmeskills.human.shoes;

public class GucciShoes implements IShoes {
    @Override
    public void takeOn() {
        System.out.println("Надеты туфли GUCCI");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты туфли GUCCI");
    }
}
