package com.registration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/siddiqui")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uName = request.getParameter("username");
		
		String psswrd = request.getParameter("password");
		
		
		if("Huzefa".equals(uName) && "Siddiqui".equals(psswrd)) {
			
		   request.setAttribute("name", uName); // Here we are sending the name to Success.jsp page.
			
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp"); // Needs to give a file path
			rd.forward(request, response);
		} 
		else {
			
			RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
			rd.forward(request, response);
		}
		
	}

}
