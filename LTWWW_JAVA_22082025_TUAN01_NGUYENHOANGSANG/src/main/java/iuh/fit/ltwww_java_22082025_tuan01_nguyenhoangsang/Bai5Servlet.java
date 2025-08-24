package iuh.fit.ltwww_java_22082025_tuan01_nguyenhoangsang;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bai5Servlet")
public class Bai5Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String facebook = request.getParameter("facebook");
        String shortBio = request.getParameter("shortBio");

        out.println("<html><head><title>Registration Result</title></head><body>");
        out.println("Name: " + firstName + " " + lastName + "<br>");
        out.println("Username: " + username + "<br>");
        out.println("Email: " + email + "<br>");
        out.println("Facebook: " + facebook + "<br>");
        out.println("Short Bio: " + shortBio + "<br>");
        out.println("</body></html>");
    }
}
