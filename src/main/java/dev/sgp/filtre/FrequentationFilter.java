package dev.sgp.filtre;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class FrequentationFilter implements Filter {
    private VisiteWebService visiteWebService = Constantes.VISITE_WEB_SERVICE;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        String url = ((HttpServletRequest)req).getRequestURI();
        long before = System.currentTimeMillis();
        filterChain.doFilter(req,resp);
        long after = System.currentTimeMillis();
        long time = after-before;
        VisiteWeb visite = new VisiteWeb(url,time);
        visiteWebService.sauvegarderVisiteWeb(visite);
    }

    @Override
    public void destroy() {

    }
}
