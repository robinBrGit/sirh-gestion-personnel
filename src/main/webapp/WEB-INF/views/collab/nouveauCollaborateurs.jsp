<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<body>
<%@ include file="nav.jsp" %>
<div class="container">
        <h1>Nouveau Collaborateur</h1>
        <form method="POST" class="needs-validation m-5">
            <div class="form-group row">
                <label for="inputNom" class="col-sm-2 col-form-label">Nom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="inputNom" id="inputNom" placeholder="Nom" required>
                    <div class="invalid-feedback">
                        Nom obligatoire
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputPrenom" class="col-sm-2 col-form-label">Prenom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="inputPrenom" id="inputPrenom" placeholder="Prenom" required>
                    <div class="invalid-feedback">
                        Prenom obligatoire
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputDateBirth" class="col-sm-2 col-form-label">Date de naissance</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" name="inputDateBirth" id="inputDateBirth" placeholder="" required>
                    <div class="invalid-feedback">
                        Date de naissance obligatoire
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="addressTextarea" class="col-sm-2 col-form-label">Adresse</label>
                <div class="col-sm-10">
                    <textarea class="form-control" name="inputAdresse" id="addressTextarea" placeholder="Adresse" required></textarea>
                    <div class="invalid-feedback">
                        Adresse obligatoire
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label for="inputNumSecu" class="col-sm-2 col-form-label">Numéro de sécurité sociale</label>
                <div class="col-sm-10">
                    <input type="number" class="form-control" name="inputNumSecu" id="inputNumSecu" placeholder="X-XX-XX-XX-XXX-XXX-XX" required>
                    <div class="invalid-feedback">
                        N° de sécurité sociale obligatoire
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
