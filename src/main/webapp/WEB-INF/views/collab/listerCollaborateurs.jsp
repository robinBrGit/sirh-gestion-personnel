<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page import="dev.sgp.entite.Collaborateur" %>
<%@page import="dev.sgp.entite.Departement" %>
<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false" %>


<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<body>
<%@ include file="nav.jsp" %>
<div class="container-fluid m-1">
    <div class="text-right">
        <a class="btn btn-dark" href="<c:url value='/collaborateurs/nouveau'/>">Ajouter un nouveau
            collaborateur</a>
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
                <input type="text" class="form-control" placeholder="Nom ou prénom" aria-label="Nom ou prénom"
                       aria-describedby="button-addon2">
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
                <input type="text" placeholder="Voir les collaborateurs désactivés" disabled class="form-control"
                       aria-label="Text input with checkbox">
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
                <c:forEach items="${listeDepartement}" var="departement">
                    <option id="<c:out value='${departement.id}'/>"><c:out value="${departement.nom}"/></option>
                </c:forEach>
            </select>
        </div>
        <div class="col-4">

        </div>
    </div>


</div>
<div class="container-fluid mb-4">
    <div class="row">
        <c:forEach items="${listeCollab}" var="collab">
            <div class="col-md-12 col-lg-6 col-xl-4">
                <div class="card mb-4 shadow-sm">
                    <div class="card-header"><c:out value="${collab.nom}"/> <c:out value="${collab.prenom}"/>
                    </div>
                    <div class="card-body">
                        <div class="row">
                            <div class="col-4">
                                <img class="img-fluid" src="<c:url value='/img/'/><c:out value='${collab.photo}'/>"
                                     alt="photo">
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
                                <p><c:out value="${collab.emailPro}"/>
                                </p>
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

            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
