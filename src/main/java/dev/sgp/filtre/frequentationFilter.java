package dev.sgp.filtre;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

public class frequentationFilter implements Filter {
	private FilterConfig config = null;
	private int id = 0;
	VisiteWebService liste = Constantes.VISITE_SERVICE;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
		config.getServletContext().log("frequentationFilter init");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long before = System.currentTimeMillis();
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		HttpServletRequest req = (HttpServletRequest) request;
		String path = req.getRequestURI();
		int temp = (int) (after - before);
		VisiteWeb visite = new VisiteWeb();
		visite.setId(id);
		visite.setChemin(path);
		visite.setTempExcution(temp);
		liste.sauvegardeVisite(visite);
		config.getServletContext().log(path + ":" + (after - before));
		id++;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
