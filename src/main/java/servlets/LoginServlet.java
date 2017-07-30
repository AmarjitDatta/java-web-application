package servlets;

import utils.mongodb.MongoDBInterface;
import utils.mysql.MySQLInterface;
import utils.security.SecurityProvider;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String nextJSP = "";
    boolean loginSuccess = false;

    try {
      String hashedPassword = SecurityProvider.GenerateHashFromString(password);
      /*Check users credentials*/
      loginSuccess = MongoDBInterface.findExistingUser(email, hashedPassword);
    } catch (NoSuchAlgorithmException naEx) {
      naEx.printStackTrace();
    }

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    PrintWriter writer = response.getWriter();
    writer.println("");

    if (loginSuccess) {
      nextJSP = "/loginSuccess";
    } else {
      nextJSP = "/loginFailure";
    }

    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
    dispatcher.forward(request, response);
  }
}
