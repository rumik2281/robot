package by.teachmeskills.human.shoes;

public class NikeShoes implements IShoes {
    @Override
    public void takeOn() {
        System.out.println("Надеты туфли Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты туфли Nike");
    }
}
