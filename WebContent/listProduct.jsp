<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ include file="header.jsp" %>
<title>La liste des produits</title>
</head>
<body>
<% for (Product p : ProductDao.getAllProducts())  { %>
	<% 		out.print(p.toString()); %><br>
	<% 	} %>
<%@ include file="footer.jsp" %>