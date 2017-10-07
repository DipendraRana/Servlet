package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadHeaderServlet
 */
@WebServlet(name = "ReaderHeaderServlet", urlPatterns = { "/ReaderHeaderServlet" })
public class ReadHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadHeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String> headerEnumeration=request.getHeaderNames();
		StringBuffer buffer=new StringBuffer();
		while(headerEnumeration.hasMoreElements()) {
			String headerName=headerEnumeration.nextElement();
			String headerValue=request.getHeader(headerName);
			buffer.append(headerName+":"+headerValue);
			buffer.append("<br/>");
		}
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.println(buffer.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
