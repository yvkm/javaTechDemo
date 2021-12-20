package yvkm.jooq;

import static yvkm.jooq.tables.Author.AUTHOR;

import java.sql.*;
import org.jooq.*;
import org.jooq.impl.*;

public class Main {
  /** @param args */
  public static void main(String[] args) {
    String userName = "root";
    String password = "002289";
    String url = "jdbc:mysql://10.8.0.1:3307/jooq";
    // Connection is the only JDBC resource that we need
    // PreparedStatement and ResultSet are handled by jOOQ, internally
    try (Connection conn = DriverManager.getConnection(url, userName, password)) {
      DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
      Result<Record> result = create.select().from(AUTHOR).fetch();
      for (Record r : result) {
        Long id = r.getValue(AUTHOR.ID);
        String firstName = r.getValue(AUTHOR.FIRST_NAME);
        String lastName = r.getValue(AUTHOR.LAST_NAME);
        System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName);
      }
    }
    // For the sake of this tutorial, let's keep exception handling simple
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
