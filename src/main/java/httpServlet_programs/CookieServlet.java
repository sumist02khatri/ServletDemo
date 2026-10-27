package httpServlet_programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("myname");
		
		//creating a cookie and adding user info
		Cookie ck = new Cookie("UserName",name);
		
		//adding a cookie to the response
		resp.addCookie(ck);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.println("Cookie has been created Successfully....<br><br>");
		pw.println("<a href='read'>CLICK HERE TO READ THE COOKIE</a>");
		pw.print("</body></html>");
		
		

	}

}
