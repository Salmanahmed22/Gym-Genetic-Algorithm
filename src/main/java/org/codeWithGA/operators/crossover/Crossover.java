package org.codeWithGA.operators.crossover;
import org.codeWithGA.core.Chromosome;

import java.util.List;

public interface Crossover {
    /**
     * Apply crossover between two parents and produce offspring.
     */
    List<Chromosome> apply(Chromosome parent1, Chromosome parent2);

    /**
     * Get the probability of crossover (e.g. 0.7 means 70% of the time).
     */
    double getCrossoverRate();
}
