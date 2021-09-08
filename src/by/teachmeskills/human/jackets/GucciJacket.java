package by.teachmeskills.human.jackets;

public class GucciJacket implements IJacket {
    @Override
    public void takeOn() {
        System.out.println("Надета куртка GUCCI");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка GUCCI");
    }
}
