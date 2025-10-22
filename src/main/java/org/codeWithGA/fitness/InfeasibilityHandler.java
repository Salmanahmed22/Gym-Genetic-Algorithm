package org.codeWithGA.fitness;
import org.codeWithGA.core.Chromosome;

public interface InfeasibilityHandler {
    double calculatePenalty(Chromosome chromosome);
}
