package servlets;

import objects.Person;
import utils.DBConnection;
import utils.InsertNewUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class RegistrationServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    Person person = new Person(request);

    try {
      connection = DBConnection.getConnection();
      System.out.println("Database connected!");
      InsertNewUser insertNewUser = new InsertNewUser(person, connection);
      insertNewUser.createNewUser();
/*      statement = connection.createStatement();
      resultSet = statement.executeQuery("select * from persons");
      while (resultSet.next()) {
        System.out.println("PersonId: " + resultSet.getString(1) + " and Email: " + resultSet.getString(2));
      }*/
      DBConnection.closeConnection();
    } catch (SQLException e) {
      throw new IllegalStateException("Cannot connect the database!", e);
    } catch (ClassNotFoundException ex) {
      throw new IllegalStateException("Could not find class!", ex);
    }

    /*A new user has been created successfully*/
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    PrintWriter writer = response.getWriter();
    writer.println("<!DOCTYPE html><html>");
    writer.println("<head>");
    writer.println("<meta charset=\"UTF-8\" />");
    writer.println("<title>MyServlet.java:doGet(): Servlet code!</title>");
    writer.println("</head>");
    writer.println("<body>");

    writer.println("<h1>This is the registration Servlet</h1>");
    writer.println("<h1>A new user has been created successfully!!!</h1>");

    writer.println("</body>");
    writer.println("</html>");
  }
}
