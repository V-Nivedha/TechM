import java.sql.*;
import java.util.Scanner;

public class UpdateRow {
    private static final String URL = "jdbc:mysql://localhost:3306/Friends";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter user ID to update: ");
            int userId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();

            System.out.print("Enter new age: ");
            int newAge = scanner.nextInt();

            String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, newName);
                pstmt.setInt(2, newAge);
                pstmt.setInt(3, userId);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Row updated successfully.");
                } else {
                    System.out.println("No matching user found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
