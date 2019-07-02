package dev.sgp.ecouter;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.time.LocalDate;
import java.time.ZonedDateTime;

public class FillerCollaborateursListner implements HttpSessionListener {
    private CollaborateurService lesCollab = Constantes.COLLAB_SERVICE;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        lesCollab.sauvegarderCollaborateur(new Collaborateur(String.valueOf(Collaborateur.nbCollab++),"Dupond","Thierry", LocalDate.of(1995,10,22),"55 rue de la ville","548745212365412","dupond.thierry@societe.com","photo.PNG", ZonedDateTime.now(),true));
        lesCollab.sauvegarderCollaborateur(new Collaborateur(String.valueOf(Collaborateur.nbCollab++),"Dupond","Thierry", LocalDate.of(1995,10,22),"55 rue de la ville","548745212365412","dupond.thierry@societe.com","photo.PNG", ZonedDateTime.now(),true));
        lesCollab.sauvegarderCollaborateur(new Collaborateur(String.valueOf(Collaborateur.nbCollab++),"Dupond","Thierry", LocalDate.of(1995,10,22),"55 rue de la ville","548745212365412","dupond.thierry@societe.com","photo.PNG", ZonedDateTime.now(),true));
        lesCollab.sauvegarderCollaborateur(new Collaborateur(String.valueOf(Collaborateur.nbCollab++),"Dupond","Thierry", LocalDate.of(1995,10,22),"55 rue de la ville","548745212365412","dupond.thierry@societe.com","photo.PNG", ZonedDateTime.now(),true));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }
}
