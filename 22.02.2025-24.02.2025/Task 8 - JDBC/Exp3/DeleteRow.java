import java.sql.*;
import java.util.Scanner;

public class DeleteRow {
    private static final String URL = "jdbc:mysql://localhost:3306/Friends";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter user ID to delete: ");
            int userId = scanner.nextInt();

            String sql = "DELETE FROM users WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, userId);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Row deleted successfully.");
                } else {
                    System.out.println("No matching user found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
