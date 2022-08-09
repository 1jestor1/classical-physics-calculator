package com.physicscalculator.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.physicscalculator.calculators.kinematicCalculator;
import com.physicscalculator.calculators.kinematicCalculatorImpl;
import com.physicscalculator.models.kinematicObject;

public class kinematicController {
	
	private kinematicCalculator knmtcClcltr;
	public ObjectMapper objctMppr;
	
	public String positionFinalGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		objctMppr = new ObjectMapper();
		knmtcClcltr = new kinematicCalculatorImpl();
		String jsonBdy = new String(request.getInputStream().readAllBytes());
		kinematicObject newKnmtcObjct = objctMppr.readValue(jsonBdy, kinematicObject.class);
		List<Double> positionI =  newKnmtcObjct.getPosition();
		List<Double> velocityI = newKnmtcObjct.getVelocity();
		List<Double> accelerationI = newKnmtcObjct.getAcceleration();
		double TimeF = newKnmtcObjct.getTime(); 
		List<Double> positionF = knmtcClcltr.MvmntToPos(accelerationI, velocityI, positionI, TimeF);
		return positionF.toString();
	}
}
