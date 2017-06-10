package optimizations;


public abstract class Experiment {

    public void execute() {
        beforeOptimization();
        afterOptimization();
    }

    public abstract void beforeOptimization();

    public abstract void afterOptimization();

}
