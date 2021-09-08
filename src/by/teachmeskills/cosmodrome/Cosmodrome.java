package by.teachmeskills.cosmodrome;

public class Cosmodrome {
    void launch(IStart startObject) {
        if (startObject.testSystems()) {
            startObject.startEngines();
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            startObject.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }
}
