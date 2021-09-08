package by.teachmeskills.cosmodrome;

import by.teachmeskills.cosmodrome.shuttle.Shuttle;
import by.teachmeskills.cosmodrome.shuttle.SpacexShuttle;

public class Run {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.launch(new Shuttle());
        cosmodrome.launch(new SpacexShuttle());
    }
}
