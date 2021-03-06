package optimizations;


public class TryCatchUsage extends Experiment {

    private static final int ITERATIONS = 1000000000;
    private Casting object = new Casting();
    int temp;

    @Override
    public void beforeOptimization() {
        for (int i = 0; i < ITERATIONS; i++) {
            if (object != null) {
                temp = 2 * 2;
            }
        }
    }

    @Override
    public void afterOptimization() {
        for (int i = 0; i < ITERATIONS; i++) {
            try {
                temp = 2 * 2;
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        String arg = args.length > 0 ? args[0] : "";
        Experiment experiment = new TryCatchUsage();
        if ("1".equals(arg)) {
            experiment.afterOptimization();
        } else {
            experiment.beforeOptimization();
        }
    }
}
