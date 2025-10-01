package com.survey.global.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletFileUpload;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/survey/file/upload")
public class SurveyFileUploadController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this);
		List<String> fileList;
		synchronized (this) {
			fileList = (List<String>)req.getServletContext().getAttribute("fileList");
			if ( null == fileList ) {
				fileList = new ArrayList<String>();
				req.getServletContext().setAttribute("fileList", fileList);
			}
		}
		if (JakartaServletFileUpload.isMultipartContent(req)) {
            DiskFileItemFactory factory = DiskFileItemFactory.builder().get();
            JakartaServletFileUpload upload = new JakartaServletFileUpload(factory);
            upload.setFileSizeMax(1024*1024);
            upload.setSizeMax(1024*1024);
            String uploadPath = "C:\\workspace_jee\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\SURVEY_PROJECT\\resources\\images";
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }
            try {
                List<FileItem> formItems = upload.parseRequest(req);
                if (formItems != null && formItems.size() > 0) {
                    for (FileItem item : formItems) {
                        if (!item.isFormField()) {
                        	if ( !item.getName().endsWith(".png") ) {
                        		continue;
                        	}
                        	String uuid = UUID.randomUUID().toString();
                        	fileList.add(uuid);
                        	String fileName = new File(uuid+".png").getName();
                            item.write(Path.of(uploadPath, fileName));
                        }
                    }
                }
            } catch (Exception ex) {
               System.out.println("There was an error: " + ex.getMessage());
            }
        }
		req.getServletContext().setAttribute("fileList", fileList);
		resp.sendRedirect(req.getContextPath());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
