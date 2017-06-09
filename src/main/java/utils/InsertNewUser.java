package utils;

import objects.Person;

import java.sql.*;

public class InsertNewUser {
  private Person person;
  private Connection connection;

  public InsertNewUser(Person person, Connection connection) {
    this.person = person;
    this.connection = connection;
  }

  public boolean createNewUser() throws SQLException {
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

    return true;
  }
}
