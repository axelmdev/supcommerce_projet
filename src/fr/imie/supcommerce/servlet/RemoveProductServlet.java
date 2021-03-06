package fr.imie.supcommerce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.supcommerce.dao.ProductDao;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/auth/removeProduct")
public class RemoveProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Long id = Long.parseLong(req.getParameter("id"));
		if(id.equals(null)) {
			resp.getWriter().println("id null");
		} else {
			ProductDao.removeProduct(id);
			resp.sendRedirect("/SupCommerce/listProduct");
		}
	}
}
