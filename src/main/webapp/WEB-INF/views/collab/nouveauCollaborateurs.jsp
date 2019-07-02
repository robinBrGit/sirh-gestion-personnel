<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<body>
<%@ include file="nav.jsp" %>
<% List<String> errors = (List<String>)request.getAttribute("Errors");
Object valueNom = request.getAttribute("inputNom")== null ? "" : request.getAttribute("inputNom");
Object valuePrenom = request.getAttribute("inputPrenom")== null ? "" : request.getAttribute("inputPrenom");
Object valueDateBirth = request.getAttribute("inputDateBirth")== null ? "" : request.getAttribute("inputDateBirth");
Object valueAdresse = request.getAttribute("inputAdresse")== null ? "" : request.getAttribute("inputAdresse");
Object valueNumSecu = request.getAttribute("inputNumSecu")== null ? "" : request.getAttribute("inputNumSecu");

boolean isErrors = false;
if(errors != null && !errors.isEmpty())isErrors = true;%>
<div class="container">
        <h1>Nouveau Collaborateur</h1>
        <form method="POST" class="needs-validation m-5">
            <div class="form-group row">
                <label for="inputNom" class="col-sm-2 col-form-label">Nom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control <%if(isErrors && errors.contains("inputNom")){%>is-invalid<%}%>" name="inputNom" id="inputNom" value="<%= valueNom %>"placeholder="Nom" required >
                    <div class="invalid-feedback">
                        Nom obligatoire
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPrenom" class="col-sm-2 col-form-label">Prenom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control <%if(isErrors && errors.contains("inputPrenom")){%>is-invalid<%}%>" name="inputPrenom" id="inputPrenom" value="<%= valuePrenom %>" placeholder="Prenom" required>
                    <div class="invalid-feedback">
                        Prenom obligatoire
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputDateBirth" class="col-sm-2 col-form-label">Date de naissance</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control <%if(isErrors && errors.contains("inputDateBirth")){%>is-invalid<%}%>" name="inputDateBirth" id="inputDateBirth" value="<%= valueDateBirth %>" placeholder="" required>
                    <div class="invalid-feedback">
                        Date de naissance obligatoire
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="addressTextarea" class="col-sm-2 col-form-label">Adresse</label>
                <div class="col-sm-10">
                    <textarea class="form-control <%if(isErrors && errors.contains("inputAdresse")){%>is-invalid<%}%>" name="inputAdresse" id="addressTextarea" placeholder="Adresse" required><%= valueAdresse %></textarea>
                    <div class="invalid-feedback">
                        Adresse obligatoire
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputNumSecu" class="col-sm-2 col-form-label">Numéro de sécurité sociale</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control <%if(isErrors && errors.contains("inputNumSecu")){%>is-invalid<%}%>" name="inputNumSecu" id="inputNumSecu" value="<%= valueNumSecu %>" placeholder="X-XX-XX-XX-XXX-XXX-XX" required>
                    <div class="invalid-feedback">
                        N° de sécurité sociale obligatoire et doit contenir 15 chiffres
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-12 text-right">
                    <button type="submit" class="btn btn-primary" data-toggle="modal" data-target="validModal">Créer</button>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
