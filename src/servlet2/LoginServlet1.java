package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet1 extends HttpServlet{
	
    @Override
      protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	 String firstName=req.getParameter("firstName");
    	 String lastName=req.getParameter("LastName");
    	 String gender=req.getParameter("Gender");
    	 String mobileNo=req.getParameter("MobileNo");
    	 String emailid=req.getParameter("Emailid");
    	 String password=req.getParameter("password");
    	 String address=req.getParameter("Address");
    	 
    	 
    	 req.setAttribute("firstName", firstName);
    	 req.setAttribute("lastName", lastName);
    	 req.setAttribute("gender", gender);
    	req.setAttribute("mobileNo", mobileNo);
    	req.setAttribute("emailid", emailid);
    	req.setAttribute("password", password);
    	req.setAttribute("address", address);
    	
   	 RequestDispatcher  rd=req.getRequestDispatcher("Login.jsp");
       	 rd.forward(req, res);
       }

}
 