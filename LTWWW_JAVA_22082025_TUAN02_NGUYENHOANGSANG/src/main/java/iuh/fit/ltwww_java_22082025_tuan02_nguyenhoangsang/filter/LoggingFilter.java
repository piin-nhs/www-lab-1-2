package iuh.fit.ltwww_java_22082025_tuan02_nguyenhoangsang.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoggingFilter extends HttpFilter implements Filter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpreq = (HttpServletRequest) req;
        System.out.println("User accessed: " + httpreq.getRequestURI() + " at " + new java.util.Date());
        chain.doFilter(req, res);
    }
}
