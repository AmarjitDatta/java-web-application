package servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter writer = response.getWriter();
    writer.println("<!DOCTYPE html><html>");
    writer.println("<head>");
    writer.println("<meta charset=\"UTF-8\" />");
    writer.println("<title>MyServlet.java:doGet(): Servlet code!</title>");
    writer.println("</head>");
    writer.println("<body>");

    writer.println("<h1>This is a Login servlet.</h1>");
    writer.println("<p>email: " + email + "</p>");
    writer.println("<p>password: " + password + "</p>");

    writer.println("</body>");
    writer.println("</html>");
  }
}
