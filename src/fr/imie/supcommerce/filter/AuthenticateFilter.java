package fr.imie.supcommerce.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/auth/*")
public class AuthenticateFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filter)
			throws IOException, ServletException {
		
		HttpSession session =  ((HttpServletRequest) req).getSession();
		Object username = session.getAttribute("username");
		if(username == null){
			((HttpServletResponse) resp).sendRedirect("/SupCommerce/login.html");
		} else {
			filter.doFilter(req, resp);
		}
	}
	
}
