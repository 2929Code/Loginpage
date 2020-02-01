package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class page2process
 */
public class page2process extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String course = request.getParameter("course");
		System.out.println("the id is:" +id);
		System.out.println("the course is:" +course);
		request.getSession().setAttribute("id",id);
		request.getSession().setAttribute("course",course);
		response.sendRedirect("jsp/printoutput.jsp");
	}

}
