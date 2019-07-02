package dev.sgp.web;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AjouterCollaborateursController extends HttpServlet {

    // recuperation du service
    private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
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
            if(numSecu.length() == 15){
                LocalDate dateNaissanceP = LocalDate.parse(dateNaissance, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                LocalDateTime dateAjout = LocalDateTime.now();
                String matricule = "M".concat(String.valueOf(Collaborateur.nbCollab));
                String emailPro = prenom+"."+nom+"@societe.com";

                Collaborateur unCollab = new Collaborateur(matricule,nom,prenom,dateNaissanceP,adresse,
                        numSecu,emailPro,"photo.PNG",dateAjout.atZone(ZoneId.of("Europe/Paris")),true);

                collabService.sauvegarderCollaborateur(unCollab);
                List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
                req.setAttribute("listeCollab", collaborateurs);
                req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
                        .forward(req, resp);
            }
            else {
                resp.setStatus(400);
                resp.getWriter().write("<div class=\"error\"><ul>");
                resp.getWriter().write("<li>Le numero de sécurité sociale doit contenir 15 chiffres</li>");
            }


        }
        else {
            resp.setStatus(400);
            resp.getWriter().write("<div class=\"error\"><ul>");
            if(nom == null || nom.equals("")){
                resp.getWriter().write("<li>Le nom n'est pas renseigné</li>");
            }
            if(prenom == null || prenom.equals("")){
                resp.getWriter().write("<li>Le prenom n'est pas renseigné</li>");
            }
            if(dateNaissance == null || dateNaissance.equals("")){
                resp.getWriter().write("<li>La date de naissance n'est pas renseigné</li>");
            }
            if(adresse == null || adresse.equals("")){
                resp.getWriter().write("<li>L'adresse n'est pas renseigné</li>");
            }
            if(numSecu == null || numSecu.equals("")){
                resp.getWriter().write("<li>Le numéro de sécuriter sociale n'est pas renseigné</li>");
            }
            resp.getWriter().write("</ul></div>");
        }


    }
}
