import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExp9 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\JDBC.txt"); // Change this to your file path

        if (file.exists() && file.isFile()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] byteArray = new byte[(int) file.length()];
                fis.read(byteArray);

                System.out.println("File content in bytes:");
                for (byte b : byteArray) {
                    System.out.print(b + " ");
                }
            } catch (IOException e) {
                System.out.println("An error occurred");
            }
        } else {
            System.out.println("File does not exist ");
        }
    }
}
