package servlets;

import utils.DBConnection;

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

    String email = request.getParameter("email");
    String lastName = request.getParameter("lastName");
    String firstName = request.getParameter("firstName");
    String address1 = request.getParameter("address1");
    String address2 = request.getParameter("address2");
    String city = request.getParameter("city");
    String state = request.getParameter("state");
    String zip = request.getParameter("zip");
    String phone = request.getParameter("phone");
    String password = request.getParameter("password");

    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DBConnection.getConnection();
      System.out.println("Database connected!");

      String query = "insert into persons (email, lastName, firstName, address1, address2, city, state, zipcode, phone)"
          + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement preparedStatement = connection.prepareStatement(query);
      preparedStatement.setString(1, email);
      preparedStatement.setString(2, lastName);
      preparedStatement.setString(3, firstName);
      preparedStatement.setString(4, address1);
      preparedStatement.setString(5, address2);
      preparedStatement.setString(6, city);
      preparedStatement.setString(7, state);
      preparedStatement.setInt(8, Integer.parseInt(zip));
      preparedStatement.setString(9, phone);
      preparedStatement.execute();

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

    writer.println("<p>email: " + email + "</p>");
    writer.println("<p>lastName: " + lastName + "</p>");
    writer.println("<p>firstName: " + firstName + "</p>");
    writer.println("<p>address1: " + address1 + "</p>");
    writer.println("<p>address2: " + address2 + "</p>");
    writer.println("<p>city: " + city + "</p>");
    writer.println("<p>state: " + state + "</p>");
    writer.println("<p>zip: " + zip + "</p>");
    writer.println("<p>phone: " + phone + "</p>");
    writer.println("<p>password: " + password + "</p>");

    writer.println("</body>");
    writer.println("</html>");
  }
}
