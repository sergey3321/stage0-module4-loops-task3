package school.mjc.stage0.loops.task3;

public class RangeSum {
    int result = 0;

    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        if (firstBoarder < 0 || secondBoarder < 0) {
            System.out.println(0);
        } else if (firstBoarder < 0 && secondBoarder < 0) {
            System.out.println(0);
        } else if (firstBoarder < secondBoarder) {
            for (int i = firstBoarder; i <= secondBoarder; i++) {
                result += i;
            }
            System.out.println(result);
        } else if (secondBoarder < firstBoarder) {
            for (int i = secondBoarder; i <= firstBoarder; i++) {
                result += i;
            }
            System.out.println(result);
        } else if (firstBoarder == secondBoarder) {
            System.out.println(firstBoarder);
        }
    }
}
