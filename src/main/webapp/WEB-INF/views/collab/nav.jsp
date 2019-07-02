<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img src="<c:url value='/img/icon_32.png'/>" width="30" height="30" alt="logo">
        </a>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-item nav-link active" href="<c:url value='/collaborateurs/lister'/>">Collaborateurs <span class="sr-only">(current)</span></a>
                <a class="nav-item nav-link" href="<c:url value='/statistiques'/>">Statistiques</a>
                <a class="nav-item nav-link" href="#">Activités</a>
            </div>
        </div>
    </nav>