package servlets;

import utils.mongodb.MongoDBInterface;
import utils.mysql.MySQLInterface;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    /*Check users credentials*/
    boolean loginSuccess = MongoDBInterface.findExistingUser(email, password);

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    PrintWriter writer = response.getWriter();
    writer.println("");

    String nextJSP = "";
    if (loginSuccess) {
      nextJSP = "/loginSuccess";
    } else {
      nextJSP = "/loginFailure";
    }

    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
    dispatcher.forward(request, response);
  }
}
