package by.teachmeskills.human.pants;

public class NikePants implements IPants {
    @Override
    public void takeOn() {
        System.out.println("Надеты штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны Nike");
    }
}
