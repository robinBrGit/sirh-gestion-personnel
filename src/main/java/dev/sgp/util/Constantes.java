package dev.sgp.util;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.service.VisiteWebService;

import java.util.HashMap;
import java.util.Map;

public interface Constantes {
    CollaborateurService COLLAB_SERVICE = new CollaborateurService();
    DepartementService DEPARTEMENT_SERVICE = new DepartementService();
    VisiteWebService VISITE_WEB_SERVICE = new VisiteWebService();
}
