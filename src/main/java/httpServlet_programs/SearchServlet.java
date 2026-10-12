package httpServlet_programs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String info = req.getParameter("info");
		
		if(info.equals("sumist")) {
			resp.sendRedirect("https://github.com/sumist02khatri");
		}else {
			resp.sendRedirect("demo.html");
		}
	}
	

}
