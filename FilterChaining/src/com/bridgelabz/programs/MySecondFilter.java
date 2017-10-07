package com.bridgelabz.programs;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MySecondFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("MySecondFilter Deleted");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("MySecondFilter before executing");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("MySecondFilter after executing");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("MySecondFilter Intialized");
	}

}
