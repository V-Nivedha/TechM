package jdbc_task1;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String URL = "jdbc:mysql://localhost:3306/database2";
    static final String USER = "root";
    static final String PASSWORD = "090204";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Welcome to Java CRUD Operations using JDBC");
            System.out.println("Creating a new table dynamically...");

            createTable(connection);

            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Insert (Statement)");
                System.out.println("2. Insert (PreparedStatement)");
                System.out.println("3. Update (Statement)");
                System.out.println("4. Delete (PreparedStatement)");
                System.out.println("5. Display Records");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");
                
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        insertUsingStatement(connection);
                        break;
                    case 2:
                        insertUsingPreparedStatement(connection, scanner);
                        break;
                    case 3:
                        updateUsingStatement(connection, scanner);
                        break;
                    case 4:
                        deleteUsingPreparedStatement(connection, scanner);
                        break;
                    case 5:
                        displayRecords(connection);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS products (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(50), " +
                "price DOUBLE)";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table 'products' created successfully.");
        }
    }

    private static void insertUsingStatement(Connection connection) throws SQLException {
        String query = "INSERT INTO products (name, price) VALUES ('Laptop', 75000.00)";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Record inserted using Statement.");
        }
    }

    private static void insertUsingPreparedStatement(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter product name: ");
        String name = scanner.next();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        String query = "INSERT INTO products (name, price) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.executeUpdate();
            System.out.println("Record inserted using PreparedStatement.");
        }
    }

    private static void updateUsingStatement(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter product ID to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter new price: ");
        double newPrice = scanner.nextDouble();

        String query = "UPDATE products SET price = " + newPrice + " WHERE id = " + id;
        try (Statement stmt = connection.createStatement()) {
            int rows = stmt.executeUpdate(query);
            if (rows > 0)
                System.out.println("Record updated using Statement.");
            else
                System.out.println("No record found with the given ID.");
        }
    }

    private static void deleteUsingPreparedStatement(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter product ID to delete: ");
        int id = scanner.nextInt();

        String query = "DELETE FROM products WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            if (rows > 0)
                System.out.println("Record deleted using PreparedStatement.");
            else
                System.out.println("No record found with the given ID.");
        }
    }

    private static void displayRecords(Connection connection) throws SQLException {
        String query = "SELECT * FROM products";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("\nProduct Records:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Price: " + rs.getDouble("price"));
            }
        }
    }
}
