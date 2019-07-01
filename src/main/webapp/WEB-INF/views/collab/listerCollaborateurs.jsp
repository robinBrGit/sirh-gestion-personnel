<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<body>
<%@ include file="nav.jsp" %>
<h1>Les collaborateurs</h1>
<ul>
<%
List<String> listeNoms =(List<String>)request.getAttribute("listeNoms");
for (String nom : listeNoms) {
%>
<li><%= nom %></li>
<%
}
%>
</ul>
</body>
</html>
