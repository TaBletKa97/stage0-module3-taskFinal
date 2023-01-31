package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        final String DELIMITER = "";
        System.out.println(DELIMITER + number % 10 + number % 100 / 10
                + number % 1000 / 100);
    }
}
