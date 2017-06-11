package optimizations;


public class StringConcatenation extends Experiment {

    private static final int ITERATIONS = 10000;

    @Override
    public void beforeOptimization() {
        String out = "";
        for(int i = 0; i < ITERATIONS; i++) {
            out = out + 1;
        }
    };

    @Override
    public void afterOptimization() {
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < ITERATIONS; i++) {
            out.append(i);
        }
    }

    public static void main(String[] args) {
        String arg = args.length > 0 ? args[0] : "";
        Experiment experiment = new StringConcatenation();
        if ("1".equals(arg)) {
            experiment.afterOptimization();
        } else {
            experiment.beforeOptimization();
        }
    }
}
