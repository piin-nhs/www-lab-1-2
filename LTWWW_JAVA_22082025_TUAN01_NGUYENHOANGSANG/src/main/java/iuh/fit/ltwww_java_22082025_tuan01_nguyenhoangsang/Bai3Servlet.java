package iuh.fit.ltwww_java_22082025_tuan01_nguyenhoangsang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
///Nguyen Hoang Sang
@WebServlet(name = "bai3Servlet", value = "/bai3-servlet")
public class Bai3Servlet extends HttpServlet {
    private String json;

    public void init() {
        User user = new User(1, "Nguyen Hoang Sang", "sang@gmail.com");
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        // Hello
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
    }

    public void destroy() {
    }
}