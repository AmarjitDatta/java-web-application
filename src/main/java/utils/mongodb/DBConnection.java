package utils.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class DBConnection {
  private static MongoClient mongoClient = null;
  private static MongoDatabase db = null;

  public static MongoDatabase getConnection() {
    if (mongoClient == null) {
      mongoClient = new MongoClient( DBResources.getHostname() , DBResources.getPortNumber());
    }

    MongoDatabase db = mongoClient.getDatabase( DBResources.getDatabaseName());
    return db;
  }

  public static void closeConnection() {
    if (mongoClient != null) {
      mongoClient.close();
    }
  }
}
