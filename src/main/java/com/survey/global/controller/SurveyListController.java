package com.survey.global.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/survey/list")
public class SurveyListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this);
		resp.setIntHeader("Refresh", 5);
		req.getRequestDispatcher("/WEB-INF/view/survey/survey_list.jsp").forward(req, resp);
	}
	
}
