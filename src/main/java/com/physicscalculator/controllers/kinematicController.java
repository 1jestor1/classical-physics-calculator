package com.physicscalculator.controllers;

import java.io.IOException;
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
		knmtcClcltr = new kinematicCalculatorImpl();
		kinematicObject newKnmtcObjct = kinematicObjectInput(request, response);
		List<Double> positionF = knmtcClcltr.MvmntToPos(newKnmtcObjct.getAcceleration(), newKnmtcObjct.getVelocity(), newKnmtcObjct.getPosition(), newKnmtcObjct.getTime());
		return positionF.toString();
	}
	
	public kinematicObject kinematicObjectInput(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		objctMppr = new ObjectMapper();
		String jsonBdy = new String(request.getInputStream().readAllBytes());
		kinematicObject newKnmtcObjct = objctMppr.readValue(jsonBdy, kinematicObject.class);
		return newKnmtcObjct;
	}
}
