import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;
public class FileExp1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String directory = "C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson";
       File dir = new File(directory);

       if(dir.exists()&& dir.isDirectory()){
           String [] list=dir.list();
           System.out.println("Files and directories are : ");
           for(String a : list){
               System.out.println(a);
           }
       }
       else{
           System.out.println("invalid Directory");

       }


    }
}