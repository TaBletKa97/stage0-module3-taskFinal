package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        System.out.println(number % 10 + number % 100 / 10
                + number % 1000 / 100 + number % 10000 / 1000);
    }
}
