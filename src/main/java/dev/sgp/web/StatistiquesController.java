package dev.sgp.web;

import dev.sgp.entite.StatsLine;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StatistiquesController extends HttpServlet {
    private VisiteWebService visiteWebService = Constantes.VISITE_WEB_SERVICE;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<StatsLine> mesStats  = StatsLine.getStats(visiteWebService.listerVisiteWeb());
        req.setAttribute("stats",mesStats);
        req.getRequestDispatcher("/WEB-INF/views/collab/statistiques.jsp")
                .forward(req, resp);
    }
}
