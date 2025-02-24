import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

class LastModifiedDate {
    public static void main(String[] args) {
        String path = "C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\JDBC.txt";

        File file = new File(path);

        if (file.exists()) {
            long lastModified = file.lastModified();
            String formattedDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date(lastModified));
            System.out.println("Last modified date of " + path + ": " + formattedDate);
        } else {
            System.out.println(path + " does not exist.");
        }
    }
}
