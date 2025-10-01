package com.survey.global.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/survey/file/download")
public class SurveyFileDownloadController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		String file_repo = "C:\\workspace_jee\\SURVEY_PROJECT\\src\\main\\webapp\\resources\\images";
		String fileName = "cd6da059-e45e-4d4c-9599-1f267dcf6007.png";
		String downloadFileFullPath = String.format("%s/%s", file_repo, fileName);
		
		File file = new File(downloadFileFullPath);
		
		resp.setHeader("Cache-Control", "no-cache");
		resp.addHeader("Content-disposition", "attachment; fileName="+fileName);
		
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buffer = new byte[1024*8];
		ServletOutputStream outputStream = resp.getOutputStream();
		
		while(true) {
			int count = fileInputStream.read(buffer);
			
			if(count == -1) { break; }
			outputStream.write(buffer, 0, count);
		}
		
		fileInputStream.close();
		outputStream.close();
	}

}
