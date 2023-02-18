package server_sessionTracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.getWriter().print("<h1>Login Successfull...</h1>");
	resp.getWriter().print("<h1><a href='LogOut?token=143'>LogOut </a></h1>");
}
}
