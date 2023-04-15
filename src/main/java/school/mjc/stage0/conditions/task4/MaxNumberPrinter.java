package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maximum = first;
        if (second > maximum && second > third) {
            maximum = second;
            }
        if (third > maximum && third > second) {
            maximum = third;
            }
        System.out.println(maximum);
        }
    }
