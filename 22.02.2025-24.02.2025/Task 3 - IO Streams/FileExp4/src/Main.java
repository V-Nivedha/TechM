import java.io.File;

public class Main {
    public static void main(String[] args) {
       String dir="C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson\\JDBC.txt";
       File file = new File(dir);
       if(file.canRead()){
           System.out.println("The file have permission to read");

       }
       else {
           System.out.print("The file doesn't have permission to read");
       }
       if(file.canWrite()){
           System.out.print("The file have permission to write");
       }
       else{
           System.out.print("The file doesn't have permission to write");
       }
    }
}