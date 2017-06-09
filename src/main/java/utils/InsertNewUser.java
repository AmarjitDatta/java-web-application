package utils;

import objects.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, person.getEmail());
    preparedStatement.setString(2, person.getLastName());
    preparedStatement.setString(3, person.getFirstName());
    preparedStatement.setString(4, person.getAddress1());
    preparedStatement.setString(5, person.getAddress2());
    preparedStatement.setString(6, person.getCity());
    preparedStatement.setString(7, person.getState());
    preparedStatement.setInt(8, person.getZip());
    preparedStatement.setString(9, person.getPhone());
    preparedStatement.execute();

    return true;
  }
}
