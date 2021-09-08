package by.teachmeskills.cosmodrome.util;

import java.util.Random;

public class NumberGenerator {
    Random random = new Random();

    public int getNumber() {
        return random.nextInt(11);
    }

    public boolean getBoolean() {
        return random.nextBoolean();
    }
}
