import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRow {
    private static final String URL = "jdbc:mysql://localhost:3306/Friends";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        String[][] data = {
                {"nivi", "21"},
                {"kishore", "25"},
                {"pooja", "22"}
        };

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            insertRows(conn, data, 0);
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertRows(Connection conn, String[][] data, int index) throws SQLException {
        if (index >= data.length) return;

        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, data[index][0]);
            pstmt.setInt(2, Integer.parseInt(data[index][1]));
            pstmt.executeUpdate();
        }

        insertRows(conn, data, index + 1);
    }
}
