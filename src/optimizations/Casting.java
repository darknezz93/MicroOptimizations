package optimizations;


public class Casting extends Experiment {

    private static final int ITERATIONS = 1000000000;
    int temp;

    @Override
    public void beforeOptimization() {

        Experiment experiment = new CodeMotion();

        for (int i = 0; i < ITERATIONS; i++) {
            if (((CodeMotion) experiment).result == 1) {
                temp = 2 * 2;
            }
        }
    }

    @Override
    public void afterOptimization() {
        Experiment experiment = new CodeMotion();
        CodeMotion codeMotion = (CodeMotion) experiment;

        for (int i = 0; i < ITERATIONS; i++) {
            if (codeMotion.result == 1) {
                temp = 2 * 2;
            }
        }
    }

    public static void main(String[] args) {
        String arg = args.length > 0 ? args[0] : "";
        Experiment experiment = new Casting();
        if ("1".equals(arg)) {
            experiment.afterOptimization();
        } else {
            experiment.beforeOptimization();
        }
    }
}
