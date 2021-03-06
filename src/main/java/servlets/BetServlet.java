/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.Bettor;
import bean.Event;
import bean.Team;
import bean.VictoryBet;
import dao.Dao;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexy Duquesnoy
 */
public class BetServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Dao<Object> dao = new Dao<Object>();

        String idBetTeam = request.getParameter("bet");

        Team betTeam = null;  
        if (!idBetTeam.equals("")) {
            betTeam = (Team) dao.getById(Team.class, Integer.parseInt(idBetTeam));
        }
        int idEvent = Integer.parseInt(request.getParameter("event"));

        Event event = (Event) dao.getById(Event.class, idEvent);
       
        Bettor bettor = (Bettor) request.getSession().getAttribute("bettor");
        
        Dao<VictoryBet> victoryBetDao = new Dao<VictoryBet>();
        List<VictoryBet> victoryBets = victoryBetDao.getBy(VictoryBet.class, "idEvent = ? AND idBettor = ?", idEvent, bettor.getIdBettor());
        
        VictoryBet victoryBet = null;  
        if(victoryBets.size() == 0) {
            victoryBet = new VictoryBet();
            victoryBet.setPoints(0);
            victoryBet.setBettor(bettor);
            victoryBet.setEvent(event);
            victoryBet.setDate(new Date()); 
        } else {
            victoryBet = victoryBets.get(0); 
        }
        
        victoryBet.setBetTeam(betTeam);
        dao.saveOrUpdate(victoryBet); 
        
        String baseUrl = request.getRequestURL().toString().substring(0, request.getRequestURL().toString().lastIndexOf("/") + 1);
        response.sendRedirect(baseUrl);
    }

}
