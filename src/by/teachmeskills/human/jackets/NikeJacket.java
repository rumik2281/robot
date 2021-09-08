package by.teachmeskills.human.jackets;

public class NikeJacket implements IJacket {
    @Override
    public void takeOn() {
        System.out.println("Надета куртка Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка Nike");
    }
}
