package by.teachmeskills.robot;

public class MaxFinder {
    public int getMax(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
}
