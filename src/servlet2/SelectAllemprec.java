package servlet2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectAllemprec extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata5","root","root");
			PreparedStatement ps=con.prepareStatement("select * from emprec4");
			
			ResultSet rs=ps.executeQuery();
			
			ArrayList<EmprecEntities> userList=new ArrayList<EmprecEntities>();
			while(rs.next()){
			int id=rs.getInt(1);
			String  fname=rs.getString(2);
			String  lname=rs.getString(3);
			String  mobile=rs.getString(4);
			String  username=rs.getString(5);
			String  password=rs.getString(6);
			
	     EmprecEntities e=new EmprecEntities(id, fname, lname, mobile, username, password);
			userList.add(e);
	}
		req.setAttribute("userlist",userList);
		
		RequestDispatcher rd=req.getRequestDispatcher("Data.jsp");
				rd.forward(req, res);
		
		con.close();
}catch(Exception e){
		System.out.println(e);
	}

}
}
