import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exp3 {
    public static void main(String[] args) {
        try {
            readFile("C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\Jdbc1.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }


            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

    }
}
