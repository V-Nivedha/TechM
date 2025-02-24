import java.io.File;
import java.io.FileNotFoundException;

public class Exp5 {
    public static void main(String[] args) {
        try {
            checkFileNotEmpty("C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\nivi.txt");
        } catch (Exception e) {
            System.out.println("Exception  " + e.getMessage());
        }
    }

    public static void checkFileNotEmpty(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        if (file.length() == 0) {
            throw new Exception("File is empty");
        }



    }
}
