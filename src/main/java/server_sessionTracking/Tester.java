package server_sessionTracking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Tester extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		//int x=(int) request.getAttribute("x");
		//response.getWriter().print(x);
		int n = Integer.parseInt(request.getParameter("y"));
		int v = Integer.parseInt(request.getParameter("h"));
		response.getWriter().print(n+" "+v);
		
	}
	

}