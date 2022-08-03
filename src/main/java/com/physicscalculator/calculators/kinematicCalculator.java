package com.physicscalculator.calculators;

import java.util.ArrayList;
import java.util.List;

public class kinematicCalculator {
	public List<Double> AccelToVel(List<Double> acceleration, List<Double> velocity, double time) {
		List<Double> newVelocity = new ArrayList<>();
		for(int i=0; i < velocity.size(); i++) {
			newVelocity.set(i, velocity.get(i)+acceleration.get(i)*time);
		}
		
		return newVelocity;
	}
	
	public List<Double> ChngOverTime(List<Double> vectorI, List<Double> vectorF, double time){
		List<Double> newVector = new ArrayList<>();
		for(int i=0; i<vectorI.size();i++) {
			newVector.set(i, (vectorF.get(i)-vectorI.get(i))/2);
		}
		return newVector;
	}
	
	public List<Double> MvmntToPos(List<Double> acceleration, List<Double> velocity, List<Double> position, double time){
		List<Double> newPosition = new ArrayList<>();
		for(int i=0; i<position.size();i++) {
			newPosition.set(i, position.get(i)+velocity.get(i)*time+(acceleration.get(i)*Math.pow(time, 2)/2));
		}
		
		return newPosition;
	}
}
