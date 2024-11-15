package mysql_create_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
	public static void main(String[] args) {
		// JDBC URL, felhasználónév és jelszó
		String url = "jdbc:mysql://localhost:3306/hello_world";
		String user = "root";
		String password = "root";

		// Kapcsolat és Statement objektum
		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();

			String sql = "CREATE TABLE students (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
					+ "name VARCHAR(100) NOT NULL," + "age INT NOT NULL" + ")";

			statement.executeUpdate(sql);
			System.out.println("The students table created successfully!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

}
