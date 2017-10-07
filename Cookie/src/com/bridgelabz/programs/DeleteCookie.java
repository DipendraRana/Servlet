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
 * Servlet implementation class DeleteCookie
 */
@WebServlet("/DeleteCookie")
public class DeleteCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cookies=null;
		Cookie cookie=null;
		cookies=request.getCookies();
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		if(cookies!=null) {
			printWriter.println("Deleting the Cookie<br/>");
			for(int i=0;i<cookies.length;i++) {
				cookie=cookies[i];
				if(cookies[i].getName().equals("firstname")) {
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					printWriter.println("Deleted Cookie: "+cookie.getName()+"<br/>");
				}
				printWriter.print("Name: "+cookie.getName()+" , ");
				printWriter.print("Value: "+cookie.getValue()+"<br/>");
			}
		}
		else
			printWriter.println("No cookies found");
		printWriter.print("<br/> <a href=\"ReadingCookie\">Check Cookie</a>");
		/*RequestDispatcher requestDispatch=request.getRequestDispatcher("CookiesSettingUp");
		requestDispatch.include(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
