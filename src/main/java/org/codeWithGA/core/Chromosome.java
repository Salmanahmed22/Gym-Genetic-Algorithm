package org.codeWithGA.core;

import java.util.ArrayList;
import java.util.List;

public class Chromosome {
    private List<Gene> genes;

    //Deep copy
    public Chromosome(List<Gene> genes) {
        this.genes = new ArrayList<>();
        for(Gene g : genes){
            this.genes.add(g.copy());
        }
    }

    public static Chromosome randomChromosome() {
        List<Gene> genes = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            genes.add(Gene.randomGene());
        }
        return new Chromosome(genes);
    }

    public List<Gene> getGenes() {
        List<Gene> copy = new ArrayList<>();
        for (Gene g : genes) copy.add(g.copy());
        return copy;
    }
    public Chromosome newWithGenes(List<Gene> newGenes) {
        return new Chromosome(newGenes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < genes.size(); i++) {
            sb.append(genes.get(i));
            if (i < genes.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
