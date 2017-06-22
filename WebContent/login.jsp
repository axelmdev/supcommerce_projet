<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib 
uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<div class="container">
	<div class="row">
		<form action="/SupCommerce/login" method="post">
			<div class="form-group">
				<label>Username</label>
				<input type="text" name="username" id="username">
			</div>
			<button class="btn btn-success">Connexion</button>
		</form>
	</div>
</div>
<%@ include file="footer.jsp" %>