package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Bettor;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		Bettor b = new Bettor();
		HttpSession session = req.getSession();
		b.setLogin(email);
		if (email.equals("test@test.test") && pwd.equals("test")) {
			session.setAttribute("email", email);
			this.getServletContext().getRequestDispatcher( "/index.jsp" ).forward( req, resp );
		} else {
			this.getServletContext().getRequestDispatcher( "/index.jsp" ).forward( req, resp );
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		if (session.getAttribute("email") != null) {
			this.getServletContext().getRequestDispatcher( "/index.jsp" ).forward( req, resp );
		} else this.getServletContext().getRequestDispatcher( "/index.jsp" ).forward( req, resp );
	}
	
	
	
}
