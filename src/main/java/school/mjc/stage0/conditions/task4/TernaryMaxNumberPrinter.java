package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        first > second && first > third?
                System.out.println(first):
                second > third && second > first?
                        System.out.println(second):
                        System.out.println(third);
    }
}
