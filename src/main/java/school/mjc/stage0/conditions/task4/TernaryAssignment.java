package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result;
        first > second? result = 10: result = -10;
        System.out.println(result);
    }
}
