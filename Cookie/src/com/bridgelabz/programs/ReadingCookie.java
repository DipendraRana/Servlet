package com.bridgelabz.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadingCookie
 */
@WebServlet("/ReadingCookie")
public class ReadingCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadingCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie=null;
		Cookie[] cookies=null;
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		cookies=request.getCookies();
		if(cookies!=null) {
			printWriter.println("Print Cookie Element<br/>");
			for(int i=0;i<cookies.length;i++) {
				cookie=cookies[i];
				printWriter.print("Name:"+cookie.getName()+" , ");
				printWriter.print("Value: "+cookie.getValue()+"<br/>");
			}
		}
		else
			printWriter.println("No cookies is found<br/>");
		printWriter.print("<br/> <a href=\"DeleteCookie\">Delete Cookie</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
