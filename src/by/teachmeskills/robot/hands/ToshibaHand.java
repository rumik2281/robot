package by.teachmeskills.robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Toshiba");
    }
}
