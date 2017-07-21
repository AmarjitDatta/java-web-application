package utils.mysql;

import contents.Person;

import java.sql.*;

public class MySQLInterface {
  private Person person;

  public MySQLInterface(Person person) {
    this.person = person;
  }

  public void createNewUser() {
    try {
      Connection connection = DBConnection.getConnection();
      System.out.println("Database connected!");

      String query = "insert into persons (email, lastName, firstName, address1, address2, city, state, zipcode, phone)"
          + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

      PreparedStatement insertPersonStatement = connection.prepareStatement(query);
      insertPersonStatement.setString(1, person.getEmail());
      insertPersonStatement.setString(2, person.getLastName());
      insertPersonStatement.setString(3, person.getFirstName());
      insertPersonStatement.setString(4, person.getAddress1());
      insertPersonStatement.setString(5, person.getAddress2());
      insertPersonStatement.setString(6, person.getCity());
      insertPersonStatement.setString(7, person.getState());
      insertPersonStatement.setInt(8, person.getZip());
      insertPersonStatement.setString(9, person.getPhone());
      insertPersonStatement.execute();

    /*Generate password and store that*/
      String query2 = "insert into person_passwd (PersonID, Email, PassWd)"
          + " values (LAST_INSERT_ID(), ?, ?)";

      PreparedStatement insertPasswordStatement = connection.prepareStatement(query2);
      insertPasswordStatement.setString(1, person.getEmail());
      insertPasswordStatement.setString(2, person.getPassword());
      insertPasswordStatement.execute();

      DBConnection.closeConnection();
    } catch (SQLException e) {
      throw new IllegalStateException("Cannot connect the database!", e);
    } catch (ClassNotFoundException ex) {
      throw new IllegalStateException("Could not find class!", ex);
    }
  }

  public static boolean findExistingUser(String email, String passwd) {
    boolean loginSuccess = false;
    try {
      Connection connection = DBConnection.getConnection();
      System.out.println("Database connected!");

      Statement statement = connection.createStatement();
      String query = "select PersonID from person_passwd where email = \"" + email + "\" and PassWd = \"" + passwd + "\"";
      ResultSet resultSet = statement.executeQuery(query);
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
    return loginSuccess;
  }
}
