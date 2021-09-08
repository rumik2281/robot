package by.teachmeskills.human.jackets;

public class AdidasJacket implements IJacket {
    @Override
    public void takeOn() {
        System.out.println("Надета куртка Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка Adidas");
    }
}
