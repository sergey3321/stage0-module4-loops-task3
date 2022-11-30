package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    int numberOne = 1;
    int numberTwo = 1;
    int numberThree = 0;
    int getSumNumbersOneAndTwo;

    public void printFibonacci(int lastFibonacci) {
        System.out.print(numberThree + " " + numberOne + " " + numberTwo + " ");
        for (int i = 4; i <= lastFibonacci; i++) {
            getSumNumbersOneAndTwo = numberOne + numberTwo;
            System.out.print(getSumNumbersOneAndTwo + " ");
            numberOne = numberTwo;
            numberTwo = getSumNumbersOneAndTwo;
        }
    }
}
