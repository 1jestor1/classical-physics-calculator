package com.physicscalculator.models;

import java.util.ArrayList;
import java.util.List;
/**
 * An physics object that can be used with kinematic equations and thus has the additional properties of 
 * @author jtorr
 *
 */
public class kinematicObject extends newtonianObject{
	private List<Double> velocity = new ArrayList<>();
	private List<Double> acceleration = new ArrayList<>();

	public List<Double> getVelocity() {
		return velocity;
	}

	public void setVelocity(List<Double> velocity) {
		this.velocity = velocity;
	}

	public List<Double> getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(List<Double> acceleration) {
		this.acceleration = acceleration;
	}
	
}
