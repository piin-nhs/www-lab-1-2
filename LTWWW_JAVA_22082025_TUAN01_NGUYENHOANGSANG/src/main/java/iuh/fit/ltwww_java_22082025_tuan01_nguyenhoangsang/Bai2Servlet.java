package iuh.fit.ltwww_java_22082025_tuan01_nguyenhoangsang;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
///Nguyen Hoang Sang
@WebServlet(name = "bai2Servlet", value = "/bai2-servlet")
public class Bai2Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "text/html";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}