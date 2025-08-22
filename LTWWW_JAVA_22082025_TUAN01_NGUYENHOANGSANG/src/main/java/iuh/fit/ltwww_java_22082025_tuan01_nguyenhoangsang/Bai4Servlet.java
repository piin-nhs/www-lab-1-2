package iuh.fit.ltwww_java_22082025_tuan01_nguyenhoangsang;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

//Nguyen Hoang Sang

@WebServlet(
        name = "bai4Servlet",
        value = "/bai4-servlet",
        initParams = {
                @WebInitParam(name = "author", value = "Nguyen Hoang Sang")
        }
)
public class Bai4Servlet extends HttpServlet {
    private String author;
    private String projectName;

    @Override
    public void init(ServletConfig config) {
        author = config.getInitParameter("author");
        ServletContext context = config.getServletContext();
        projectName = context.getInitParameter("projectName");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>Tác giả: " + author + "</p>");
        out.println("<p>Tên dự án: " + projectName + "</p>");
        out.println("<form action=\"bai4-servlet\" method=\"post\">");
        out.println("  Nhập tên: <input type=\"text\" name=\"username\" />");
        out.println("  <input type=\"submit\" value=\"Gửi\" />");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>Chào bạn, " + username + "</p>");
        out.println("</body></html>");
    }
}
