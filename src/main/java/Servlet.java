import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter writer = response.getWriter()) {
            writer.println("<!DOCTYPE html><html>");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\" />");
            writer.println("<title>Projet DevOps</title>");
            writer.println("</head>");
            writer.println("<body>");

            writer.println("<h1>Andres BOULANGER - Leo RULLIAT - Allan CHÊNE - Quentin COUDERT - Robin POUGEA.</h1>");

            writer.println("</body>");
            writer.println("</html>");
        }
    }
}
