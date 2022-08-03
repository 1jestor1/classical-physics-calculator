package com.physicscalculator.models;

import java.util.ArrayList;
import java.util.List;

public class kinematicObject extends physicsObject{
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
