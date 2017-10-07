package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorHandler
 */
@WebServlet("/ErrorHandlerFile")
public class ErrorHandlerFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		Throwable error=(Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer errorCode=(Integer) request.getAttribute("javax.servlet.error.status_code");
		String servletName=(String) request.getAttribute("javax.servlet.error.servlet_name");
		if(servletName==null) 
			servletName="Unknown";
		String getUrl=(String) request.getAttribute("javax.servlet.error.request_uri");
		if(getUrl==null)
			getUrl="Unknown";
		if(error==null&&errorCode==null) {
			printWriter.println("<br/>Error Information is missing");
			printWriter.println("Please return to the <a href=\""+response.encodeURL("http://localhost:8080/")+"\">Home Page</a>.");
		}
		else if(errorCode!=null)
			printWriter.println("The Status Code: "+errorCode+"<br/>");
		else {
			printWriter.println("The Error Information:<br/>");
			printWriter.println("Servlate Name: "+servletName+"<br/>");
			printWriter.println("Exception Type: "+error.getClass().getName()+"<br/>");
			printWriter.println("The Request URI: "+getUrl+"<br/>");
			printWriter.println("The Exception message: "+error.getMessage()+"<br/>");
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
