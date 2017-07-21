package utils.mongodb;

public class DBResources {
  private static final String hostname = "localhost";
  private static final int portNumber = 27017;
  private static final String databaseName = "javawebdb";

  public static String getHostname() {
    return hostname;
  }

  public static int getPortNumber() {
    return portNumber;
  }

  public static String getDatabaseName() {
    return databaseName;
  }
}
