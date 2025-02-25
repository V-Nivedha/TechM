import java.sql.*;
import java.util.Scanner;

public class DatabaseOperations{
    private static final String URL = "jdbc:mysql://localhost:3306/Friends";
    private static final String USER = "root";
    private static final String PASSWORD = "090204";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select a Row");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        insertRow(conn, scanner);
                        break;
                    case 2:
                        updateRow(conn, scanner);
                        break;
                    case 3:
                        deleteRow(conn, scanner);
                        break;
                    case 4:
                        selectRow(conn, scanner);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static void insertRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "Row inserted successfully." : "Insert failed.");
        }
    }


    private static void updateRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter user ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new age: ");
        int age = scanner.nextInt();

        String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "Row updated successfully." : "No matching user found.");
        }
    }


    private static void deleteRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter user ID to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "Row deleted successfully." : "No matching user found.");
        }
    }


    private static void selectRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter user ID to retrieve: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM users WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age"));
            } else {
                System.out.println("No matching user found.");
            }
        }
    }
}
