package optimizations;


public class CodeMotion extends Experiment {

    public double result;

    private static final int ITERATIONS = 100;
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
}
