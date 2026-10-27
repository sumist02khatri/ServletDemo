package httpServlet_programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		//getting cookies from the request
	      Cookie [] cookies = req.getCookies();
	      
	      //checking if cookie object for this client exist or not 
	      if(cookies!=null) {
	    	  pw.println("Cookies found , Request has been sent by same Client ");
	    	  
	    	  //accessing the information inside the cookie about the client
	    	  for(Cookie ck:cookies) {
	    		  pw.println("Cookie name: "+ck.getName()+" , value: "+ck.getValue());  
	    	  }
	      }else {
	    	  pw.print("Cookies Not found Request has been sent from different client");
	      }
		
	}
}
