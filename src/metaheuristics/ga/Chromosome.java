/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metaheuristics.ga;

import java.util.ArrayList;
import problems.Evaluator;

/**
 *
 * @author
 */
@SuppressWarnings("serial")
public abstract class Chromosome<G> extends ArrayList<G> {

    protected double fitnessVal = 0D;

    public Chromosome() {
    }

    public double getFitnessVal() {
        return fitnessVal;
    }

    public abstract void calcFitness(Evaluator<G> objEval);

}
