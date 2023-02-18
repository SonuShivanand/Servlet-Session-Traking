package server_sessionTracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session1")
public class SessionSample1 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int a=6;
	
	HttpSession httpSession=req.getSession();
	httpSession.setAttribute("a",a);
	httpSession.setMaxInactiveInterval(15);

	resp.sendRedirect("session2");
	}

}
