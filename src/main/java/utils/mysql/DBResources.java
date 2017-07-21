package utils.mysql;

public class DBResources {
  private static final String url = "jdbc:mysql://localhost:3306/user_information";
  private static final String dbusername = "root";
  private static final String dbpassword = "admin";

  public String getUrl() {
    return url;
  }

  public String getDbusername() {
    return dbusername;
  }

  public String getDbpassword() {
    return dbpassword;
  }
}
