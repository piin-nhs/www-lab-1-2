package iuh.fit.ltwww_java_22082025_tuan02_nguyenhoangsang;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AuthenticationFilter extends HttpFilter implements Filter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        String usernameCon = this.getInitParameter("username");
        String passwordCon = this.getInitParameter("password");

        if (username.equals(usernameCon) && password.equals(passwordCon)){
            chain.doFilter(req, res);
        }else {
            PrintWriter writer = res.getWriter();
            writer.println("Sai tai khoan, mat khau");
        }
    }
}
