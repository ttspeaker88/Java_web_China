package mysql_delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudentExample {
	private static final String URL = "jdbc:mysql://localhost:3306/hello_world";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static void main(String[] args) {
		DeleteStudentExample example = new DeleteStudentExample();
		example.deleteStudentById(1);
	}

	// delete record by ID
	public void deleteStudentById(int id) {
		String sql = "DELETE FROM students WHERE id = ?";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			preparedStatement.setInt(1, id);

			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Successfully deleted the record with ID: " + id);
			} else {
				System.out.println("The record with this ID doens't exist.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

