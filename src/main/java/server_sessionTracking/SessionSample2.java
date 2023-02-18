package server_sessionTracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session2")
public class SessionSample2 extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	HttpSession httpSession=req.getSession();
	
//int a=(int)	httpSession.getAttribute("a");(Null Point Exception.....)
resp.getWriter().print("<h1>"+httpSession.getAttribute("a")+"</h1>");
	
}
}
