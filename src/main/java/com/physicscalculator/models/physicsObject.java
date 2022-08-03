package com.physicscalculator.models;

import java.util.ArrayList;
import java.util.List;

public class physicsObject {
	private double mass;
	private List<Double> position = new ArrayList<>();
	
	public physicsObject() {
		
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public List<Double> getPosition() {
		return position;
	}
	
	public void setPosition(List<Double> position) {
		this.position = position;
	}
}
