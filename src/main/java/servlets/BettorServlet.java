/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.Bettor;
import bean.Event;
import dao.Dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Louis
 */
public class BettorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        Dao<Bettor> dao = new Dao<Bettor>();
        Bettor bettor = dao.getById(Bettor.class, Integer.parseInt(request.getParameter("id")));
        request.setAttribute("bettor", bettor);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bettor.jsp").forward(request, response);

    }
}
