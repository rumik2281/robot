package by.teachmeskills.human;

import by.teachmeskills.human.jackets.AdidasJacket;
import by.teachmeskills.human.jackets.GucciJacket;
import by.teachmeskills.human.jackets.NikeJacket;
import by.teachmeskills.human.pants.AdidasPants;
import by.teachmeskills.human.pants.GucciPants;
import by.teachmeskills.human.pants.NikePants;
import by.teachmeskills.human.shoes.AdidasShoes;
import by.teachmeskills.human.shoes.GucciShoes;
import by.teachmeskills.human.shoes.NikeShoes;

public class Run {
    public static void main(String[] args) {
        Human firstHuman = new Human("Vasya", new AdidasJacket(), new GucciShoes(), new NikePants());
        Human secondHuman = new Human("Evgenii", new NikeJacket(), new AdidasShoes(), new GucciPants());
        Human thirdHuman = new Human("Alexander", new GucciJacket(), new NikeShoes(), new AdidasPants());
        System.out.println("first Human:");
        firstHuman.takeAllOn();
        firstHuman.takeAllOff();
        System.out.println("second Human:");
        secondHuman.takeAllOn();
        secondHuman.takeAllOff();
        System.out.println("third human:");
        thirdHuman.takeAllOn();
        thirdHuman.takeAllOff();
    }
}
