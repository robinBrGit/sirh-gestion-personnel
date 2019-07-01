package dev.sgp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditerCollaborateurController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String matricule = req.getParameter("matricule");

        if(matricule != null){
            //code HTML ecrit dans le corps de la reponse
            resp.setStatus(200);
            resp.getWriter().write("<p>Matricule : "
                    + matricule
                    +"</p>");
        }
        else {
            resp.setStatus(400);
            resp.getWriter().write("Erreur : Un matricule est attendu");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String matricule = req.getParameter("matricule");
        String titre = req.getParameter("titre");
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");

        if((matricule != null && !matricule.equals("")) && (titre != null && !titre.equals("")) && (nom != null && !nom.equals("")) && (prenom != null && !prenom.equals(""))){
            resp.setStatus(201);
            resp.getWriter().write("<p>Creation d'un collaborateur avec les informations suivantes :</p>"
                    +"<ul>"
                    +"<li>"
                    +"matricule="+matricule+","
                    +"titre="+titre+","
                    +"nom="+nom+","
                    +"prenom="+prenom+","
                    +"</li>"
                    +"</ul>");
        }
        else{
            resp.setStatus(400);
            resp.getWriter().write("<p>Les paramètres suivants sont incorrects :</p>"
                    +"<ul>");
            if(matricule == null || matricule.equals("")){
                resp.getWriter().write("<li>matricule="+matricule+"</li>");
            }
            if(titre == null || titre.equals("")){
                resp.getWriter().write("<li>titre="+titre+"</li>");
            }
            if(nom == null || nom.equals("")){
                resp.getWriter().write("<li>nom="+nom+"</li>");
            }
            if(prenom == null || prenom.equals("")){
                resp.getWriter().write("<li>matricule="+prenom+"</li>");
            }
            resp.getWriter().write("</ul>");
        }
    }
}
