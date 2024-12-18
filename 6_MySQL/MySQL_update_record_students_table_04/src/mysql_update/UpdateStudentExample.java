package mysql_update;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateStudentExample {
    private static final String URL = "jdbc:mysql://localhost:3306/hello_world"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = "root"; 

    public static void main(String[] args) {
        UpdateStudentExample example = new UpdateStudentExample();
        example.updateStudentAge(1, 25);
        example.updateStudentName(2, "Michael Brown"); 
    }

    // age update
    public void updateStudentAge(int id, int newAge) {
        String sql = "UPDATE students SET age = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setInt(1, newAge);
            preparedStatement.setInt(2, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Successfully updated the record with ID: " + id + " New age: " + newAge);
            } else {
                System.out.println("The record doens't exist with this ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // name update
    public void updateStudentName(int id, String newName) {
        String sql = "UPDATE students SET name = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Successfully updated the record with ID: " + id + " New name: " + newName);
            } else {
                System.out.println("The record doens't exist with this ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

