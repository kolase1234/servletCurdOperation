package servlet2;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo1 implements Servlet {
	

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("this is service method");
		
	}
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("this is init method");
		
	}

   @Override
	public void destroy() {
	   System.out.println(" Destory to Service method");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

