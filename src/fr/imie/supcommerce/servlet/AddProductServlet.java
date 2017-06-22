package fr.imie.supcommerce.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.model.Product;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/auth/addProduct")
public class AddProductServlet extends HttpServlet {
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		RequestDispatcher rd = req.getRequestDispatcher("/addProduct.jsp");
//		rd.forward(req, resp);
//	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name_product = req.getParameter("name_product");
		String descr_product = req.getParameter("descr_product");
		String price_product = req.getParameter("price_product");
		Product p = new Product(name_product, descr_product,Float.parseFloat(price_product));
		ProductDao.addProduct(p);
		Long id = null;
		for (Product p1 : ProductDao.getAllProducts()) {
			if (p1.getName().equals(name_product)) {
				id = p1.getId();
			} else {
				id = null;
			}
		}
		
		PrintWriter out = resp.getWriter();  
		resp.setContentType("text/html");  
		out.println("<script type=\"text/javascript\">");  
		out.println("alert('Product ajouté');");  
		out.println("</script>");
		if(id.equals(null)){
			resp.setContentType("text/html");  
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Produit inconnu : id null');");  
			out.println("</script>");
		} else {
			resp.sendRedirect("/SupCommerce/showProduct?id=" + id);
		}
	}
	
	
}
