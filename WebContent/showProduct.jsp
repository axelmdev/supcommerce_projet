<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ include file="header.jsp" %>

	<% 
	Long id = Long.parseLong(request.getParameter("id"));
	Product p = ProductDao.findProduct(id);
	
		if (p != null) {
			out.print(p.toString());
		} else {
			out.print("No product with id " + id);
		}
	 %>
<%@ include file="footer.jsp" %>