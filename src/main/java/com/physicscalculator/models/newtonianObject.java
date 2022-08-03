package com.physicscalculator.models;

import java.util.ArrayList;
import java.util.List;

/**
 * The most basic mechanical object that has two properties every physics mechanical Object has: mass, a position in space and time.
 * @author jtorr
 *
 */
public class newtonianObject {
	private double mass;
	private double time;
	private List<Double> position = new ArrayList<>();
	
	public newtonianObject() {
		
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

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
}
