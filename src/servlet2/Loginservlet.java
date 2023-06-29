package servlet2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Loginservlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	String userName= req.getParameter("userName");
    	String pass= req.getParameter("password");
    	
       System.out.println(userName);
        System.out.println(pass);
    }
	
}
