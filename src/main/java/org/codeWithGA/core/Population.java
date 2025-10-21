package org.codeWithGA.core;

import org.codeWithGA.core.Chromosome;
import java.util.ArrayList;
import java.util.List;


public class Population {
    private List<Chromosome> chromosomes;

    public Population(int size) {
        chromosomes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            chromosomes.add(Chromosome.randomChromosome());
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