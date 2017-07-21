package servlets;

import utils.mysql.DBConnection;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    /*Check users credentials*/
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    boolean loginSuccess = false;

    try {
      connection = DBConnection.getConnection();
      System.out.println("Database connected!");

      statement = connection.createStatement();
      String query = "select PersonID from person_passwd where email = \"" + email + "\" and PassWd = \"" + password + "\"";
      resultSet = statement.executeQuery(query);
      if (resultSet.next()) {
        loginSuccess = true;
      } else {
        loginSuccess = false;
      }
      DBConnection.closeConnection();
    } catch (SQLException e) {
      throw new IllegalStateException("Cannot connect the database!", e);
    } catch (ClassNotFoundException ex) {
      throw new IllegalStateException("Could not find class!", ex);
    }

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
