package genericServlet_Programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("pass");
		
		//validate
		if(username.equals("Sumist")&&password.equals("12345")) //Login Succesfull
			{
			RequestDispatcher rd= req.getRequestDispatcher("welcome");
			rd.forward(req, res);
			}
		   else {
			 res.setContentType("text/html");
			 
			 PrintWriter pw = res.getWriter();
			 pw.print("INCORRECT USERNAME OR PASSWORD !!!");
			 
			 RequestDispatcher rd = req.getRequestDispatcher("login.html");
			 rd.include(req, res);
			 
		   }	
	}
	
}
