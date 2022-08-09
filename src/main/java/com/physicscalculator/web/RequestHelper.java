package com.physicscalculator.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.physicscalculator.controllers.kinematicController;
import com.physicscalculator.models.kinematicObject;

public class RequestHelper {
	
	private static kinematicController knmtcCntrllr = new kinematicController();
	
	public static Object processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String rsrc = request.getRequestURI();
		String isltdRsrc = rsrc.replace("/physicscalculator/api", "");
		PrintWriter wrtr = response.getWriter();
		switch(isltdRsrc) {
		case "/positionf":
		
			response.setContentType("application/json");
			wrtr.write(knmtcCntrllr.positionFinalGet(request, response));
			response.setStatus(202);
			break;
		default:
				
			response.setStatus(404);
			break;
		}
		
		return null;
	}
	
}
