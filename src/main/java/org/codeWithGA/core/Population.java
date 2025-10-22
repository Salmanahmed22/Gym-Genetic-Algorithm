package org.codeWithGA.core;

import org.codeWithGA.fitness.FitnessEvaluator;
import org.codeWithGA.fitness.InfeasibilityHandler;

import java.util.ArrayList;
import java.util.List;


public class Population {
    private List<Chromosome> chromosomes;


    public Population(int size,
                      FitnessEvaluator fitnessEvaluator, InfeasibilityHandler infeasibilityHandler) {
        chromosomes = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Chromosome randomChromosome = Chromosome.randomChromosome();
            randomChromosome.calculateFitness(fitnessEvaluator, infeasibilityHandler);
            chromosomes.add(randomChromosome);
        }
    }

    public List<Chromosome> getChromosomes() {
        return chromosomes;
    }

    @Override
    public String toString() {
        return chromosomes.toString();
    }
}