import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String args[]) throws IOException {
    System.out.println("Folder and Files are created succesfully");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter case number case:1 create a normal file\n case:2 create a folder with 3 files\n case:3 create a folder with 4 files");
        int caseNumber = scanner.nextInt();
        scanner.nextLine();
        switch (caseNumber){
            case 1:
                File file1 = new File("C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\10.02.2025\\file1.txt");
                file1.createNewFile();
                break;
            case 2:
                folderwith3files();
                break;
            case 3:
                folderwith4files();

        }



    }
    static void folderwith3files()throws IOException{
        File folder = new File("C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\10.02.2025\\3filesfolder");
        folder.mkdir();
        File file2 = new File(folder, "Examplefile1.txt");
        File file1 = new File(folder, "Examplefile2.txt");
        File file3 = new File(folder, "Examplefile3.txt");
        file3.createNewFile();
        file1.createNewFile();
        file2.createNewFile();
    }
    static void folderwith4files()throws IOException{
        File folder = new File("C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\10.02.2025\\4filesfolder");
        folder.mkdir();
        File file2 = new File(folder, "Examplefile1.txt");
        File file1 = new File(folder, "Examplefile2.txt");
        File file3 = new File(folder, "Examplefile3.txt");
        file3.createNewFile();
        File file4 = new File(folder, "Examplefile3.txt");
        file4.createNewFile();
        file1.createNewFile();
        file2.createNewFile();
    }
}