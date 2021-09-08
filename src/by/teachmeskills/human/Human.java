package by.teachmeskills.human;

import by.teachmeskills.human.jackets.IJacket;
import by.teachmeskills.human.pants.IPants;
import by.teachmeskills.human.shoes.IShoes;

public class Human implements IHuman {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private IJacket jacket;
    private IShoes shoes;
    private IPants pants;

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public Human(String name, IJacket jacket, IShoes shoes, IPants pants) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
    }


    @Override
    public void takeAllOn() {
        jacket.takeOn();
        pants.takeOn();
        shoes.takeOn();
    }

    @Override
    public void takeAllOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
