package mysql_query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseQueryExample {
   
	// Database URL, username, and password
    static final String DB_URL = "jdbc:mysql://localhost:3306/hello_world";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Step 1: Register JDBC driver (optional for newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to the database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Step 3: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "SELECT ID, NAME, AGE, ADDRESS, SALARY FROM CUSTOMERS";
            ResultSet rs = stmt.executeQuery(sql);

            // Step 4: Process the ResultSet
            while (rs.next()) {
                // Retrieve data by column name
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                int age = rs.getInt("AGE");
                String address = rs.getString("ADDRESS");
                double salary = rs.getDouble("SALARY");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.print(", Age: " + age);
                System.out.print(", Address: " + address);
                System.out.println(", Salary: " + salary);
            }

            // Step 5: Clean up the environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
