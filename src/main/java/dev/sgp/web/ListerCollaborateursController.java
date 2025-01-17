package dev.sgp.web;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ListerCollaborateursController extends HttpServlet {
    // recuperation du service
    private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
    private DepartementService departementService = Constantes.DEPARTEMENT_SERVICE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // utilisation du service
        List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
        List<Departement> departements = departementService.listerDepartements();
        req.setAttribute("listeCollab", collaborateurs);
        req.setAttribute("listeDepartement", departements);
        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
                .forward(req, resp);
    }
}
