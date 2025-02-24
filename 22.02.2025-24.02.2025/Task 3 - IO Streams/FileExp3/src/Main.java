import java.io.File;

public class Main {
    public static void main(String[] args) {
        String dir="C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson";
        File f = new File(dir);
        if(f.exists()) {
            if (f.isDirectory()) {
                System.out.println("the given path is directory and it exsists ");
            }
            else if(f.isFile()){
                System.out.println("the given path is file and it exsists ");
            }
        }
        else{
            System.out.println("The given path doesn't exsists");
        }

    }
}