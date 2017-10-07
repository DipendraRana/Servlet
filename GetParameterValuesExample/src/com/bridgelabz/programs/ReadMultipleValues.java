package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadMultipleValues
 */
@WebServlet("/ReadMultipleValues")
public class ReadMultipleValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadMultipleValues() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message="";
		String values[]=request.getParameterValues("checkBoxGrp");
		if(values!=null) {
			for(int i=0;i<values.length;i++)
				message=message+"<BR/>"+values[i];
		}
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.println(message );
	}

}
