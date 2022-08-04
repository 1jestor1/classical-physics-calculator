package com.physicscalculator.calculators;

import java.util.List;

public interface kinematicCalculator {
	
	List<Double> AccelToVel(List<Double> acceleration, List<Double> velocity, double time);
	
	List<Double> ChngOverTime(List<Double> vectorI, List<Double> vectorF, double time);
	
	List<Double> MvmntToPos(List<Double> acceleration, List<Double> velocity, List<Double> position, double time);
}
