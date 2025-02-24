import java.io.File;
public class FileExp8 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\JDBC.txt"); // Change this to your file path

        if (file.exists() && file.isFile()) {
            long bytes = file.length();
            double kilobytes = bytes / 1024.0;
            double megabytes = kilobytes / 1024.0;

            System.out.println("File size in bytes: " + bytes);
            System.out.println("File size in KB: " + kilobytes);
            System.out.println("File size in MB: " + megabytes);
        } else {
            System.out.println("File does not exist or is not a valid file.");
        }
    }

}