package com.survey.global.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.catalina.tribes.util.Arrays;

import com.survey.global.util.ScriptRemover;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/survey/submit")
public class SurveySubmitController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println(this);
		String address = req.getParameter("address");
		String telecom = req.getParameter("telecom");
		String nation = req.getParameter("nation");
		String[] hobby = req.getParameterValues("hobby");
		String hope = req.getParameter("hope");
		
		Map<String,String> survey = new HashMap<String,String>();
		survey.put("id", UUID.randomUUID().toString());
		survey.put("address", ScriptRemover.remove(address));
		survey.put("telecom", telecom);
		survey.put("nation", nation);
		survey.put("hobby", Arrays.toString(hobby));
		survey.put("hope", ScriptRemover.remove(hope));
		
		List<Map<String,String>> surveyList;
		synchronized (this) {
			surveyList = (List<Map<String,String>>)req.getServletContext().getAttribute("surveyList");
			if ( null == surveyList ) {
				surveyList = new ArrayList<Map<String,String>>();
			}
		}
		surveyList.add(survey);
		req.getServletContext().setAttribute("surveyList", surveyList);
		
		
		
		
		
		
		
		
		
		
	}
	
}
