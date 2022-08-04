package com.physicscalculator.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static Object processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String resource = request.getRequestURI().replace("/physicscalculator/api", "");
		switch(resource) {
		
		/*
		 * To-Do:
		 * + Calculate Final Position (ArrayList) (positionf) 
		 * + Calculate Initial Position (ArrayList) (positioni)
		 * + Calculate Final Velocity (ArrayList) (velocityf)
		 * + Calculate Initial Velocity (ArrayList) (velocityi)
		 */
		
		default:
			
			response.setStatus(404);
			break;
		}
		return null;
		
	}
	
}
