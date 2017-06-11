package optimizations;


import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public abstract class Experiment {


    private Instant start;
    private Instant end;

    Scanner s = new Scanner(System.in);

    public void execute() {
        System.out.println("Eksperyment: " + this.getClass().getSimpleName());
        System.out.println("Wcisnij enter...");
        s.nextLine();
        start = Instant.now();
        beforeOptimization();
        end = Instant.now();
        System.out.println("Before optimization: " + Duration.between(start, end).toNanos() / 1000000000.0 + " s");
        System.out.println("Wcisnij enter...");
        s.nextLine();
        start = Instant.now();
        afterOptimization();
        end = Instant.now();
        System.out.println("After optimization: " + Duration.between(start, end).toNanos() / 1000000000.0 + " s");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\n");
    }

    public void executeBeforeOptimizationJMC() {
        s.nextLine();
        beforeOptimization();
        s.nextLine();
    }

    public void executeAfterOptimizationJMC() {
        s.nextLine();
        afterOptimization();
        s.nextLine();
    }

    public abstract void beforeOptimization();

    public abstract void afterOptimization();

}
