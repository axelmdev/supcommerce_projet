<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="fr.imie.supcommerce.model.Product" %>
    <%@ page import="fr.imie.supcommerce.dao.ProductDao" %>
    <%@ page import="javax.servlet.http.HttpServletRequest" %>
    <%@ page import="javax.servlet.http.HttpServletResponse" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
<title></title>
</head>
<body>
<div class="header" style="border:2px solid black; background-color:#854221;">
		<a href="/SupCommerce/listProduct.jsp">Liste des produits</a>
		<% if(session.getAttribute("username").equals(null)) { %>
		<a href="/SupCommerce/login.html">Login</a>
		<% } else { %>
			<a href="/SupCommerce/auth/addProduct.jsp">Ajouter un produit</a>
			<a href="/SupCommerce/logout">Logout</a>
		<% } %>
</div>