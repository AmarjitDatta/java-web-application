package utils.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  private static Connection conn;
  private static DBResources dbResources = new DBResources();

  public static Connection getConnection() throws SQLException, ClassNotFoundException {
    if (conn == null || conn.isClosed()) {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(dbResources.getUrl(), dbResources.getDbusername(), dbResources.getDbpassword());
    }
    return conn;
  }

  public static void closeConnection() throws SQLException {
    if (conn != null && !conn.isClosed()) {
      conn.close();
    }
  }
}
