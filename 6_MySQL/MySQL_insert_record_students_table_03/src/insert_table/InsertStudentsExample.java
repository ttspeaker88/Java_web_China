package insert_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentsExample {
    private static final String URL = "jdbc:mysql://localhost:3306/hello_world";
    private static final String USER = "root"; 
    private static final String PASSWORD = "root"; 

    public static void main(String[] args) {
        InsertStudentsExample example = new InsertStudentsExample();
        example.insertStudent("John Doe", 20);
        example.insertStudent("Jane Smith", 22);
        example.insertStudent("Emily Johnson", 19);
    }

    public void insertStudent(String name, int age) {
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
             
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully: " + name + ", age: " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
