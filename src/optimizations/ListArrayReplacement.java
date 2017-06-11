package optimizations;


import java.util.ArrayList;
import java.util.List;

public class ListArrayReplacement extends Experiment {

    private static final int ITERATIONS = 100000;

    private List<Integer> list = new ArrayList();
    private int[] array = new int[ITERATIONS];


    @Override
    public void beforeOptimization() {
        for(int i = 0; i < ITERATIONS; i++) {
            list.add(1);
            int temp = list.get(i);
        }
    }

    @Override
    public void afterOptimization() {
        for(int i = 0; i < ITERATIONS; i++) {
            array[i] = 1;
            int temp = array[i];
        }
    }

    public static void main(String[] args) {
        String arg = args.length > 0 ? args[0] : "";
        Experiment experiment = new ListArrayReplacement();
        if ("1".equals(arg)) {
            experiment.afterOptimization();
        } else {
            experiment.beforeOptimization();
        }
    }
}
