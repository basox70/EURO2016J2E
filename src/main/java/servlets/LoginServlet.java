package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Bettor;
import bean.Event;
import bean.Stadium;
import bean.Team;
import java.util.LinkedList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

/**
 *
 * @author Alexy Duquesnoy
 */
public class LoginServlet extends HttpServlet {

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
            this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //<editor-fold defaultstate="collapsed" desc="exemple">
//        // Lance la session qui permet la connexion entre la BDD et le java
//        Session session = HibernateUtil.getSession();
//
//        // On créer un nouvel objet Stadium que l'on va sauvegarder ensuite
//        Stadium stadiumCreate = new Stadium();
//        stadiumCreate.setName("Created Stadium");
//
//        // On récupère un objet stocker en base avec son id
//        Stadium stadiumUpdate = (Stadium) session.load(Stadium.class, 1);
//        stadiumUpdate.setName("Updated Stadium");
//
//        Stadium stadiumDelete  = (Stadium) session.load(Stadium.class, 3);
//
//        /* Créer une nouvelle transaction qui permettra de mettre à jours
//        les données dans la BDD */
//        Transaction t = session.getTransaction();
//        t.begin();
//
//        // Sauvegarde l'objet en base
//        session.persist(stadiumCreate);
//
//        // Met à jours l'objet en base
//        session.update(stadiumUpdate);
//
//        // Supprime l'objet en base
//        session.delete(stadiumDelete);
//
//        // On commit la transaction pour effectuer les actions
//        t.commit();
//
//        // On ferme la session
//        session.close();
        //</editor-fold>
        
        Stadium stadium = new Stadium();
        stadium.setName("try onetomany 2");
        
        Event event = new Event();
        event.setName("mainquare2");
        
        Event event2 = new Event();
        event2.setName("mainquare3");
        
        LinkedList<Event> events = new LinkedList<Event>();
        events.add(event);
        
        stadium.setEvents(events);
                
        Session session = HibernateUtil.getSession();
        
        Transaction t = session.getTransaction();
        t.begin();
        
        session.persist(stadium);
        
        t.commit();
        session.close();

        // TODO Auto-generated method stub
        HttpSession httpSession = req.getSession();
        if (httpSession.getAttribute("email") != null) {
            this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        } else {
            this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }

}
