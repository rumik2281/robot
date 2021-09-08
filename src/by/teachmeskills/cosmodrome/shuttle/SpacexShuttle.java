package by.teachmeskills.cosmodrome.shuttle;

import by.teachmeskills.cosmodrome.IStart;
import by.teachmeskills.cosmodrome.util.NumberGenerator;

import java.util.Random;

public class SpacexShuttle implements IStart {

    @Override
    public boolean testSystems() {
        NumberGenerator num = new NumberGenerator();
        return num.getBoolean();
    }

    @Override
    public void startEngines() {
        System.out.println("SpaceX engine start");
    }

    @Override
    public void start() {
        System.out.println("SpaceX shuttle start");
    }
}
