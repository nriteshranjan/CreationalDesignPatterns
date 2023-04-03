package singleton;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionProviderDemo {
    public static void main(String[] args) {
        ConnectionProvider instance = ConnectionProvider.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        Connection con = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(con);

        System.out.println(timeAfter - timeBefore);

        Statement stmt;
        try {
            stmt = con.createStatement();
            int count = stmt.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(100), City VARCHAR(100))");
            System.out.println("Table created successfully in database!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        con = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(con);
        System.out.println(timeAfter - timeBefore);
    }
}
