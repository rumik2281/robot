package by.teachmeskills.human.pants;

public class AdidasPants implements IPants {
    @Override
    public void takeOn() {
        System.out.println("Надеты штаны Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны Adidas");
    }
}
