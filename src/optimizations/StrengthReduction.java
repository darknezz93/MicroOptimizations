package optimizations;


public class StrengthReduction extends Experiment {

    private int result1;
    private int result2;
    private static final int ITERATIONS = 1000000000;

    @Override
    public void beforeOptimization() {
        for(int i = 1; i <= ITERATIONS; i++) {
            result1 = 1000 / 4;
            result2 = 1000 * 2;
        }
    }

    @Override
    public void afterOptimization() {
        for(int i = 1; i <= ITERATIONS; i++) {
            result1 = 1000 >> 2; // /4
            result2 = 1000 << 1; // * 2
        }
    }

    public static void main(String[] args) {
        String arg = args.length > 0 ? args[0] : "";
        Experiment experiment = new StrengthReduction();
        if ("1".equals(arg)) {
            experiment.afterOptimization();
        } else {
            experiment.beforeOptimization();
        }
    }
}
