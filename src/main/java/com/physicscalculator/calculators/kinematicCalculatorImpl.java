package com.physicscalculator.calculators;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculator methods that calculate new vectors using classical kinematic formulas.
 * @author jtorr
 *
 */
public class kinematicCalculatorImpl implements kinematicCalculator{
	/**
	 * Takes initial acceleration and velocity vectors to calculate a final velocity for a particular time.
	 * @param acceleration (ArrayList)
	 * @param velocity (ArrayList)
	 * @param time (double)
	 * @return new velocity (ArrayList)
	 */
	public List<Double> AccelToVel(List<Double> acceleration, List<Double> velocity, double time) {
		List<Double> newVelocity = new ArrayList<>();
		for(int i=0; i < velocity.size(); i++) {
			newVelocity.add(i, velocity.get(i)+acceleration.get(i)*time);
		}
		
		return newVelocity;
	}
	
	/**
	 * Determines the rate of change for generic vectors with respect to time.
	 * @param vectorI (ArrayList)
	 * @param vectorF (ArrayList)
	 * @param time (double)
	 * @return new vector (ArrayList)
	 */
	public List<Double> ChngOverTime(List<Double> vectorI, List<Double> vectorF, double time){
		List<Double> newVector = new ArrayList<>();
		for(int i=0; i<vectorI.size();i++) {
			newVector.add(i, (vectorF.get(i)-vectorI.get(i))/2);
		}
		return newVector;
	}
	
	/**
	 * Takes initial acceleration, velocity and position vectors to calculate a final position for a particular time.
	 * @param acceleration (ArrayList)
	 * @param velocity (ArrayList)
	 * @param position (ArrayList)
	 * @param time (double)
	 * @return new position (ArrayList)
	 */
	public List<Double> MvmntToPos(List<Double> acceleration, List<Double> velocity, List<Double> position, double time){
		List<Double> newPosition = new ArrayList<>();
		for(int i=0; i<position.size();i++) {
			newPosition.add(i, position.get(i)+velocity.get(i)*time+(acceleration.get(i)*Math.pow(time, 2)/2));
		}
		
		return newPosition;
	}
}
