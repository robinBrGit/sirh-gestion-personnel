<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<body>
<%@ include file="nav.jsp" %>
<div class="container-fluid m-1">
        <div class="text-right">
            <button type="button" class="btn btn-dark">Ajouter un nouveau collaborateur</button>
        </div>
    </div>
    <div class="container-fluid m-4">
        <div class="row m-2">
            <div class="col-sm">
                <h1>Les collaborateurs</h1>
            </div>
        </div>
        <div class="row m-2">
            <div class="col-4 text-right">
                <label for="">Rechercher un nom ou prénom qui commence par :</label>
            </div>
            <div class="col-4">
                <div class="input-group mb-3">
                    <input type="text" class="form-control" placeholder="Nom ou prénom" aria-label="Nom ou prénom" aria-describedby="button-addon2">
                    <div class="input-group-append">
                        <button class="btn btn-outline-secondary" type="button" id="button-addon2">Rechercher</button>
                    </div>
                </div>
            </div>
            <div class="col-4">
                <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <div class="input-group-text">
                            <input type="checkbox" aria-label="Checkbox for following label">
                        </div>
                    </div>
                    <input type="text" placeholder="Voir les collaborateurs désactivés" disabled class="form-control" aria-label="Text input with checkbox">
                </div>
            </div>
        </div>
        <div class="row m-2">
            <div class="col-4 text-right">
                <label class="text-right" for="">Filtrer par département :</label>
            </div>
            <div class="col-4 text-left">
                <select class="custom-select" id="inputGroupSelect01">
                            <option selected>Tous</option>
                            <option value="1">Comptabilité</option>
                            <option value="2">Ressources humaines</option>
                            <option value="3">Informatique</option>
                          </select>
            </div>
            <div class="col-4">

            </div>
        </div>


    </div>
    <div class="card-deck m-5">
<%
List<Collaborateur> listeCollab =(List<Collaborateur>)request.getAttribute("listeCollab");
for (Collaborateur collab : listeCollab) {
%>
<div class="card">
            <div class="card-header"><%= collab.getNom()%> <%= collab.getPrenom()%></div>
            <div class="card-body">
                <div class="row">
                    <div class="col-4">
                        <img class="img-fluid" src="<%=request.getContextPath()%>/img/<%=collab.getPhoto()%>" alt="photo">
                    </div>
                    <div class="col-4">
                        <p>Fonction</p>
                        <p>Département</p>
                        <p>Email</p>
                        <p>Téléphone</p>
                    </div>
                    <div class="col-4">
                        <p>xxxxxxxxxxxxxx</p>
                        <p>xxxxxxxxxxxxxx</p>
                        <p>xxxxxxxxxxxxxx</p>
                        <p>xxxxxxxxxxxxxx</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col text-right m-2">
                    <button type="button" class="btn btn-dark">Editer</button>
                </div>
            </div>
        </div>
<%
}
%>
</div>

</body>
</html>
