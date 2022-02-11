package com.Servlet;

import java.io.IOException;

import javax.servlet.*;

public class First_Servlet implements Servlet
{

	@Override
	public void destroy() {
    System.out.println("Calling by destroy()");		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("calling by getservletconfig()");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("Calling by getservletinfo()");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
	System.out.println("Calling by init()");	
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	System.out.println("Calling by service()");	
	}

}
