package httpServlet_programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("myname");
		String phone = req.getParameter("phone");
		String yop = req.getParameter("passout");
		String marks = req.getParameter("percentage");

		PrintWriter pw = resp.getWriter();
		pw.println("User's Details");
		pw.println("name: " +name);
		pw.println("Phone Number: "+phone);
		pw.println("Year Of PassOut: "+yop);
		pw.println("Percentage: "+marks+"%");

	}

}
