package by.teachmeskills.robot.legs;

import java.sql.SQLOutput;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Делает шаг нога Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
