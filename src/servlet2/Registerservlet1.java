package servlet2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Registerservlet1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 String fname=req.getParameter("fname");
		  String lname=req.getParameter("lname");
		  String mobile=req.getParameter("mobile");
		  String username=req.getParameter("username");
		  String password=req.getParameter("password");
		  try{
			  Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata5","root","root"); 
			PreparedStatement ps=con.prepareStatement("insert into emprec4(`fname`,`lname`,`mobile`,`username`,`password`)values(?,?,?,?,?)");
		ps.setString(1,fname);
		ps.setString(2,lname);
		ps.setString(3,mobile);
		ps.setString(4,username);
		ps.setString(5,password);
		
		int s=ps.executeUpdate();
		
		
		
		if(s==1){
			req.setAttribute("errmsg" ,"Record Added Succrssfully");
		}else{
			req.setAttribute("errmsg","unable to add");
			
			}
		}

      catch(Exception e){
     System.out.println(e);
     req.setAttribute("errmsg", "unable to add");
}

  RequestDispatcher rd=req.getRequestDispatcher("addemprec.jsp");
    rd.forward(req,res);



	



	}

}
