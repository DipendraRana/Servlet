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
 * Servlet implementation class Cookies
 */
@WebServlet("/CookiesSettingUp")
public class CookiesSettingUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesSettingUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie firstName=new Cookie("firstname",request.getParameter("firstname"));
		Cookie lastName=new Cookie("lastname",request.getParameter("lastname"));
		firstName.setMaxAge(60*60*24);
		lastName.setMaxAge(60*60*24);
		response.addCookie(firstName);
		response.addCookie(lastName);
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.print("Cookie information:<br/> First Name: "+request.getParameter("firstname")+"<br/> Last Name: "+request.getParameter("lastname"));
		printWriter.print("<br/> <a href=\"ReadingCookie\">Check Cookie</a>");
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
