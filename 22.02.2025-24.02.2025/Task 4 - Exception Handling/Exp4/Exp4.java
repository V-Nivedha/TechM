import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exp4 {
    public static void main(String[] args) {
        try {
            numbers("C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\numbers.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void numbers(String path) throws Exception {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int n = scanner.nextInt();
                    if (n > 0) {
                        throw new Exception("Positive number found");
                    }
                } else {
                    scanner.next();
                }
            }

    }
}
