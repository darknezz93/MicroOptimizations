package main;


import optimizations.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Experiment> experiments;

    public static void main(String[] args) {
        prepareExperiment();
        executeExperiment();
    }

    private static void prepareExperiment() {
        experiments = new ArrayList<>();
        experiments.add(new StrengthReduction());
        experiments.add(new CodeMotion());
        experiments.add(new ListArrayReplacement());
        experiments.add(new ForeachForLoop());
        experiments.add(new StringConcatenation());
        experiments.add(new TryCatchUsage());
        experiments.add(new Casting());
    }

    private static void executeExperiment() {
        for(Experiment experiment: experiments) {
            experiment.execute();
        }
    }

    private static void executeexperimentJMC() {

    }

}
