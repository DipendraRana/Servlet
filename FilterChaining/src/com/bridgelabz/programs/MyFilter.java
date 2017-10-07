package com.bridgelabz.programs;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilter Intialized");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilter before executing");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("MyFilter after executing");
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("MyFilter Deleted");
	}


}
