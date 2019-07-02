package dev.sgp.util;

import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;

import java.util.HashMap;
import java.util.Map;

public interface Constantes {
    CollaborateurService COLLAB_SERVICE = new CollaborateurService();
    DepartementService DEPARTEMENT_SERVICE = new DepartementService();
}
