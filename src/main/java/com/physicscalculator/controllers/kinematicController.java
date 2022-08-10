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
	/**
	 * Takes a json input of time, position, velocity, and acceleration from the request body to calculate the final position.
	 * Outputs the final position into response body. 
	 * @param request is the origin of the json input.
	 * @param response is the endpoint of the Final Position.
	 * @return Final Position as a String formatted as a json.
	 * @throws ServletException
	 * @throws IOException
	 */
	public String positionFinalGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		objctMppr = new ObjectMapper();
		knmtcClcltr = new kinematicCalculatorImpl();
		kinematicObject newKnmtcObjct = kinematicObjectInput(request, response);
		List<Double> positionF = knmtcClcltr.MvmntToPos(newKnmtcObjct.getAcceleration(), newKnmtcObjct.getVelocity(), newKnmtcObjct.getPosition(), newKnmtcObjct.getTime());
		String json = objctMppr.writeValueAsString(positionF);
		return json;
	}
	
	/**
	 * Takes a json input of time, acceleration and velocity from the request body to calculate the final velocity.
	 * @param request is the origin of the json input.
	 * @param response is the endpoint of the Final Velocity.
	 * @return Final Velocity as a String formatted as a json.
	 * @throws ServletException
	 * @throws IOException
	 */
	public String velocityFinalGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		objctMppr = new ObjectMapper();
		knmtcClcltr = new kinematicCalculatorImpl();
		kinematicObject newKnmtcObjct = kinematicObjectInput(request, response);
		List<Double> velocityF = knmtcClcltr.AccelToVel(newKnmtcObjct.getAcceleration(), newKnmtcObjct.getVelocity(), newKnmtcObjct.getTime());
		String json = objctMppr.writeValueAsString(velocityF);
		return json;
	}
	
	/**
	 * Converts a json input of mass, time, position, velocity, and acceleration into a kinematicObject that contains those
	 * properties.
	 * @param request is the origin of the json input.
	 * @param response should not receive any new information.
	 * @return kinematicObject
	 * @throws ServletException
	 * @throws IOException
	 */
	public kinematicObject kinematicObjectInput(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		objctMppr = new ObjectMapper();
		String jsonBdy = new String(request.getInputStream().readAllBytes());
		kinematicObject newKnmtcObjct = objctMppr.readValue(jsonBdy, kinematicObject.class);
		return newKnmtcObjct;
	}
}
