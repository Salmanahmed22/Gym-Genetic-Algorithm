package org.codeWithGA.caseStudy;

import org.codeWithGA.core.Chromosome;
import org.codeWithGA.fitness.FitnessEvaluator;

public class GymWorkoutFitness implements FitnessEvaluator{
    @Override
    public double calculate(Chromosome chromosome) {
        WorkoutPlan metrics = new WorkoutPlan(chromosome);

        double totalReward = metrics.totalProgress;

        if (metrics.restDays >= 1 && metrics.restDays <= 2) {
            totalReward += 10.0;
        }

        return totalReward;
    }
}
