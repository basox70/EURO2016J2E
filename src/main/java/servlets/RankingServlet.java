/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.Bettor;
import dao.BettorDao;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Louis
 */
public class RankingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        BettorDao dao = new BettorDao();
        List<Bettor> bettors = dao.getBettorOrderBy("currentPositionScore DESC");
        request.setAttribute("bettors", bettors);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/ranking.jsp").forward(request, response);

    }
}
