package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		if (email.equals("test@test.test") && pwd.equals("test")) {
			this.getServletContext().getRequestDispatcher( "/WEB-INF/logged.jsp" ).forward( req, resp );
		} else {
			this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( req, resp );
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( req, resp );
	}
	
	
	
}
