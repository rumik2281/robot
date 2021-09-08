package by.teachmeskills.human.shoes;

public class AdidasShoes implements IShoes {
    @Override
    public void takeOn() {
        System.out.println("Надеты туфли Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты туфли Adidas");
    }
}
