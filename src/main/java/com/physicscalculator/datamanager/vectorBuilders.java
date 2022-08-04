package com.physicscalculator.datamanager;

import java.util.List;

public interface vectorBuilders {
	
	List<Double> OneDVector(double x);
	
	List<Double> TwoDVector(double x, double y);
	
	List<Double> ThreeDVector(double x, double y, double z);
}
