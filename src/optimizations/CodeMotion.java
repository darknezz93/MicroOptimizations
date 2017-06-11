package optimizations;


public class CodeMotion extends Experiment {

    public double result;

    private static final int ITERATIONS = 10000000;
    private static final double CONSTANT = 1;

    @Override
    public void beforeOptimization() {
        for(int i = 0; i < ITERATIONS; i++) {
            result = Math.PI * Math.cos(CONSTANT);
        }
    }

    @Override
    public void afterOptimization() {
        double cos = Math.cos(CONSTANT);
        for(int i = 0; i < ITERATIONS; i++) {
            result = Math.PI * cos;
        }
    }

    public static void main(String[] args) {
        String arg = args.length > 0 ? args[0] : "";
        Experiment experiment = new CodeMotion();
        if ("1".equals(arg)) {
            experiment.afterOptimization();
        } else {
            experiment.beforeOptimization();
        }
    }
}
