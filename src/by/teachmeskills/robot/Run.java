package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot firstRobot = new Robot(new SamsungHead(2), new SonyHand(1), new ToshibaLeg(5));
        Robot secondRobot = new Robot(new SonyHead(10), new SamsungHand(5), new SonyLeg(50));
        Robot thirdRobot = new Robot(new ToshibaHead(9), new SamsungHand(11), new SamsungLeg(64));
        firstRobot.action();
        secondRobot.action();
        thirdRobot.action();
        MaxFinder maxFinder = new MaxFinder();
        System.out.println(maxFinder.getMax(firstRobot.getPrice(), secondRobot.getPrice(), thirdRobot.getPrice()));

    }
}
