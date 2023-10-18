package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip <= lastInRow) {
            if (lastInRow >= 0) {
                long sum = 0;
                long skipSum = 0;
                for (int i = 1; i <= lastInRow; i++) {
                    if (i <= numberToSkip) {
                        skipSum += i;
                    } else {
                        sum += i;
                    }
                }
                System.out.printf("skipped sum is %d%n", skipSum);
                System.out.printf("counted sum is %d%n", sum);
            } else {
                System.out.println("last number in row is negative");
            }
        } else {
            System.out.println("number to skip is bigger then the last");
        }
    }
}
