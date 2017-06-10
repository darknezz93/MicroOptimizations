package optimizations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForeachForLoop extends Experiment {

    private static final int ITERATIONS = 100000;

    private List<Integer> list = new ArrayList<>(Collections.nCopies(ITERATIONS, 1));
    int temp;

    @Override
    public void beforeOptimization() {
        for(int i = 0; i < ITERATIONS; i++) {
            temp = 2 * 2;
        }
    }

    @Override
    public void afterOptimization() {
        for(Integer integer: list) {
            temp = 2 * 2;
        }
    }
}
