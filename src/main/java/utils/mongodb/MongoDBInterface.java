package utils.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import contents.Person;
import org.bson.Document;

public class MongoDBInterface {
  public static void createNewUser(Person person) {
    try {
      MongoDatabase mongoDatabase = utils.mongodb.DBConnection.getConnection();
      MongoCollection<Document> collection = mongoDatabase.getCollection("Person");

      Document doc = new Document("email", person.getEmail()).
          append("lastName", person.getLastName()).
          append("firstName", person.getFirstName()).
          append("address1", person.getAddress1()).
          append("address2", person.getAddress2()).
          append("city", person.getCity()).
          append("state", person.getState()).
          append("zip", person.getZip()).
          append("phone", person.getPhone()).
          append("password", person.getPassword());

      collection.insertOne(doc);
      utils.mongodb.DBConnection.closeConnection();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static boolean findExistingUser(String email, String passwd) {
    boolean loginSuccess = false;
    try {
      MongoDatabase mongoDatabase = utils.mongodb.DBConnection.getConnection();
      MongoCollection<Document> collection = mongoDatabase.getCollection("Person");

      BasicDBObject searchObject = new BasicDBObject();
      searchObject.put("email", email);
      searchObject.put("password", passwd);
      MongoCursor<Document> results = collection.find(searchObject).iterator();

      if (results.hasNext()) {
        loginSuccess = true;
      } else {
        loginSuccess = false;
      }
      //utils.mongodb.DBConnection.closeConnection();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return loginSuccess;
  }
}
