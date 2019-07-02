<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<body>
<%@ include file="nav.jsp" %>
<div class="container-fluid">
    <table class="table table-striped table-dark">
        <thead>
        <tr>
            <th scope="col">Chemin</th>
            <th scope="col">Nombres de visites</th>
            <th scope="col">Min (ms)</th>
            <th scope="col">Max (ms)</th>
            <th scope="col">Moyenne (ms)</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${stats}" var="statLine">
            <tr>
                <td><c:out value="${statLine.url}"/></td>
                <td><c:out value="${statLine.nbVisite}"/></td>
                <td><c:out value="${statLine.min}"/></td>
                <td><c:out value="${statLine.max}"/></td>
                <td><c:out value="${statLine.moyenne}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
