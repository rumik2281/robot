package by.teachmeskills.cosmodrome.shuttle;

import by.teachmeskills.cosmodrome.IStart;
import by.teachmeskills.cosmodrome.util.NumberGenerator;

public class Shuttle implements IStart {

    @Override
    public boolean testSystems() {
        NumberGenerator randomizer = new NumberGenerator();
        return randomizer.getNumber() > 3;
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели шаттла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт шаттла.");
    }
}
