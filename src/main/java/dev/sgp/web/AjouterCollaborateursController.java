package dev.sgp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class AjouterCollaborateursController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateurs.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("inputNom");
        String prenom = req.getParameter("inputPrenom");
        String dateNaissance = req.getParameter("inputDateBirth");
        String adresse = req.getParameter("inputAdresse");
        String numSecu = req.getParameter("inputNumSecu");

        if((nom != null && !nom.equals(""))
                && (prenom != null && !prenom.equals(""))
                && (dateNaissance != null && !dateNaissance.equals(""))
                && (adresse != null && !adresse.equals(""))
                && (numSecu != null && !numSecu.equals(""))){

        }
        else {

        }


    }
}
