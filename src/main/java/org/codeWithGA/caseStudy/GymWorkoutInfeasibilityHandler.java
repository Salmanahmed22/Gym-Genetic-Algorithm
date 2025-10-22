package org.codeWithGA.caseStudy;

import org.codeWithGA.core.Chromosome;
import org.codeWithGA.fitness.InfeasibilityHandler;

/**
 * Implements the InfeasibilityHandler interface and calculates PENALTIES ONLY.
 **/

public class GymWorkoutInfeasibilityHandler implements InfeasibilityHandler {
    @Override
    public double calculatePenalty(Chromosome chromosome) {
        WorkoutPlan metrics = new WorkoutPlan(chromosome);

        double totalPenalty = 0.0;

        if (metrics.totalFatigue > 10) {
            totalPenalty += 10.0;
        }
        if (metrics.totalHours > 6.0) {
            totalPenalty += 20.0;
        }
        if (metrics.strengthDays > 4) {
            totalPenalty += 10.0;
        }
        if (metrics.restDays == 0) {
            totalPenalty += 20.0;
        }

        return totalPenalty;
    }
}
