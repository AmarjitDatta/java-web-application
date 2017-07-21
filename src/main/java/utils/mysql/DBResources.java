package utils.mysql;

import java.sql.Connection;
import java.sql.ResultSet;

public class DBResources {
  private String url = "jdbc:mysql://localhost:3306/user_information";
  private String dbusername = "root";
  private String dbpassword = "admin";

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDbusername() {
    return dbusername;
  }

  public void setDbusername(String dbusername) {
    this.dbusername = dbusername;
  }

  public String getDbpassword() {
    return dbpassword;
  }

  public void setDbpassword(String dbpassword) {
    this.dbpassword = dbpassword;
  }
}
