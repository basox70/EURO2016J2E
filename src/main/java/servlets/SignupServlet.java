package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Bettor;
import utils.HibernateUtil;

public class SignupServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String email = req.getParameter("email");
        String pwd = req.getParameter("pwd");
        String pwd_conf = req.getParameter("pwd_conf");
        HttpSession session = req.getSession();
        String error = "";
        Session hibernateSession = HibernateUtil.getSession();
        Bettor b = new Bettor();
        
        b.setLogin(email);
        b.setPassword(pwd);
        
        if (!pwd.equals(pwd_conf)) {
        	error = "La confirmation de mot de passe ne correspond pas";
        	session.setAttribute("error", error);
        } else {
        	String hql = "FROM Bettor WHERE login = :email";
        	Query query = hibernateSession.createQuery(hql);
        	query.setParameter("email", email);
        	List results = query.list();
        	if (results.isEmpty()) {
        		Transaction t = hibernateSession.getTransaction();
        		t.begin();
        		hibernateSession.persist(b);
        		t.commit();
        		session.setAttribute("email", email);
                
        	} else {
        		error = "L'adresse mail est déjà présente dans la base de données";
            	session.setAttribute("errorSignUp", error);
        	}
        }
        
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

    }
}
