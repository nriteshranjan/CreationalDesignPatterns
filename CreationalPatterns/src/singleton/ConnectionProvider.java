package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    private static volatile ConnectionProvider instance = null;
    private static volatile Connection con = null;

    private ConnectionProvider() {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }

        if (con != null) {
            throw new RuntimeException("Use getConnection() method to create instance");
        }
    }

    public static ConnectionProvider getInstance() {
        if (instance == null) {
            synchronized (ConnectionProvider.class) {
                if (instance == null) {
                    instance = new ConnectionProvider();
                }
            }

        }
        return instance;
    }

    public Connection getConnection() {
        try {
            if (con == null) {
                synchronized (ConnectionProvider.class) {
                    if (con == null) {
                        // Create a connection to the database
                        String jdbcUrl = "jdbc:mysql://localhost:3306/books";
                        con = DriverManager.getConnection(jdbcUrl, "root", "10253122");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
