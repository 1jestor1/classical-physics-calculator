package com.physicscalculator.datamanager;

import java.util.ArrayList;
import java.util.List;
/**
 * Creates "vectors" (ArrayList<>) from real numbers (doubles). 
 * @author jtorr
 *
 */
public class vectorBuilders {
	
	/**
	 * Creates a one dimensional vector so that single element input is still compatible with calculators and models.
	 * @param x (double)
	 * @return 1D Vector (ArrayList)
	 */
	public List<Double> OneDVector(double x){
		List<Double> newVector = new ArrayList<>();
		newVector.set(0, x);
		return newVector;
	}
	
	/**
	 * Creates a two dimensional vector from two numbers.
	 * @param x (double)
	 * @param y (double)
	 * @return 2D Vector (ArrayList)
	 */
	public List<Double> TwoDVector(double x, double y){
		List<Double> newVector = OneDVector(x);
		newVector.set(1, y);
		return newVector;
	}
	
	/**
	 * Creates a three dimensional vector from three numbers.
	 * @param x (double)
	 * @param y (double)
	 * @param z (double)
	 * @return 3D Vector (ArrayList)
	 */
	public List<Double> ThreeDVector(double x, double y, double z){
		List<Double> newVector = TwoDVector(x,y);
		newVector.set(2, z);
		return newVector;
	}
}
