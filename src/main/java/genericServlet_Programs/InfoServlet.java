package genericServlet_Programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/information")
public class InfoServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name =req.getParameter("username");
		String email= req.getParameter("email");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String gender = req.getParameter("gender");
		String dOB = req.getParameter("dob");
		
		PrintWriter pw = res.getWriter();
		pw.println("THANK YOU FOR YOUR SUBMISSION");
		pw.println("User's Details");
		pw.println(name);
		pw.println(email);
		pw.println(phone);
		pw.println(address);
		pw.println(gender);
		pw.println(dOB);
		
		
		
	}

	

}
