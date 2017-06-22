<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="../header.jsp" %>
<title>Ajouter un produit</title>
</head>
<body>
	<form method="post" action="/SupCommerce/auth/addProduct">
	 	<div class="form-group">
	 		<label>Nom</label>
	 		<input type="text" name="name_product">
	 	</div>
		<div class="form-group">
			<label>Description</label>
			<input type="text" name="descr_product">
		</div>
		<div class="form-group">
			<label>Prix</label>
			<input type="number" name="price_product">
		</div>
		<button class="btn btn-success">Ajouter un produit</button>
	</form>
<%@ include file="../footer.jsp" %>

