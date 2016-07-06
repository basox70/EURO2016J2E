package servlets;

import bean.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.Dao;
import dto.EventDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServlet
 */
public class BetAjaxServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println(request.getParameter("bettor"));
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        Dao<Event> dao = new Dao<Event>();

        Event event = dao.getById(Event.class, (int) Integer.parseInt(request.getParameter("idEvent")));

        if (event != null) {
            EventDTO eventDTO = new EventDTO(event);

            String json = mapper.writeValueAsString(eventDTO);

            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.print(json);
            out.flush();
        }
    }

}
