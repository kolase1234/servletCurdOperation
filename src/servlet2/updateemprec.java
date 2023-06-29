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

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@SuppressWarnings("serial")
public class updateemprec extends HttpServlet{


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		 String fname=req.getParameter("fname");
		  String lname=req.getParameter("lname");
		  String mobile=req.getParameter("mobile");
		  String username=req.getParameter("username");
		  String password=req.getParameter("password");
	
		  
		  try{
			  Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata5","root","root"); 
			PreparedStatement ps=con.prepareStatement("update emprec4 set fname=?,lname=?,mobile=?,username=?,password=? where id=? ");
		ps.setString(1,fname);
 		ps.setString(2,lname);
 		ps.setString(3,mobile);
 		ps.setString(4,username);
 		ps.setString(5,password);
 		ps.setInt(6, id);
 		
 		
 		 int rs=ps.executeUpdate();
 		if(rs==1){
 	      req.setAttribute("errMsg", "Record update Succrssfully");
 		}else{
 			 req.setAttribute("errMsg", "unable to  updated");
 		}
 	         
		  
 
		  } catch(Exception e){
      System.out.println(e);
}

   RequestDispatcher rd=req.getRequestDispatcher("updateform.jsp");
     rd.forward(req,res);
}
}

	


