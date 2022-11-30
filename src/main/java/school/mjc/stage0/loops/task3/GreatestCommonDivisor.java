package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    int temporaryVariable = 0;
    public void printGCD(int first, int second) {
        if (first == 0 || second == 0) {
            System.out.println(second);
        } else if (first < second) {
            temporaryVariable = first;
            first = second;
            second = temporaryVariable;
            printGCD(first % second, second);
        } else if (first % second == 0) {
            System.out.println(second);
        } else {
            printGCD(second, first % second);
        }
    }
}

