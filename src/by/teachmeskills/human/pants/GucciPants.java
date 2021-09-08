package by.teachmeskills.human.pants;

public class GucciPants implements IPants {

    @Override
    public void takeOn() {
        System.out.println("Надеты штаны GUCCI");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны GUCCI");
    }
}
