package server_sessionTracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie1")
public class CookieSample1  extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String msg="hello";
	Cookie cookie=new Cookie("msg", msg);
	Cookie cookie1=new Cookie("a", "5");
	Cookie cookie2=new Cookie("b", "10");
	
	
	cookie.setMaxAge(6);
	cookie1.setMaxAge(6);
	cookie2.setMaxAge(9);
	
	resp.addCookie(cookie);
	resp.addCookie(cookie1);
	resp.addCookie(cookie2);
	
	resp.sendRedirect("cookie2");
	
	
}
}
