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
import java.util.ArrayList;
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
        List<String> error = new ArrayList<>();

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
                resp.sendRedirect(req.getContextPath()+"/collaborateurs/lister");
            }
            else {
                resp.setStatus(400);
                error.add("inputNumSecu");
                req.setAttribute("Errors",error);
                req.setAttribute("inputNom",nom);
                req.setAttribute("inputPrenom",prenom);
                req.setAttribute("inputDateBirth",dateNaissance);
                req.setAttribute("inputAdresse",adresse);
                req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateurs.jsp")
                        .forward(req, resp);
            }


        }
        else {
            resp.setStatus(400);
            if(nom == null || nom.equals("")){
                error.add("inputNom");
            }
            else{
                req.setAttribute("inputNom",nom);
            }
            if(prenom == null || prenom.equals("")){
                error.add("inputPrenom");
            }
            else {
                req.setAttribute("inputPrenom",prenom);            }
            if(dateNaissance == null || dateNaissance.equals("")){
                error.add("inputDateBirth");
            }
            else {
                req.setAttribute("inputDateBirth",dateNaissance);
            }
            if(adresse == null || adresse.equals("")){
                error.add("inputAdresse");
            }
            else {
                req.setAttribute("inputAdresse",adresse);
            }
            if(numSecu == null || numSecu.equals("")){
                error.add("inputNumSecu");
            }
            else if(numSecu.length() == 15) {
                req.setAttribute("inputNumSecu",numSecu);
            }
            else {
                error.add("inputNumSecu");
            }
            req.setAttribute("Errors",error);
            req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateurs.jsp")
                    .forward(req, resp);


        }


    }
}
