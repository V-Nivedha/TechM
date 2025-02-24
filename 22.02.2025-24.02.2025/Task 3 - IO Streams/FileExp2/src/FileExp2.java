import java.io.File;
import java.io.FilenameFilter;

class FileExp2 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\vnive\\OneDrive\\Desktop\\Tech M Handson";
        String extension = ".txt";

        File dir = new File(directoryPath);

        if (dir.exists() && dir.isDirectory()) {
            FilenameFilter filter = (file, name) -> name.toLowerCase().endsWith(extension.toLowerCase());
            String[] fileList = dir.list(filter);

            if (fileList != null && fileList.length > 0) {
                System.out.println("Files with extension " + extension + " in " + directoryPath + ":");
                for (String file : fileList) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No files found with the extension " + extension);
            }
        } else {
            System.out.println("Invalid directory path or directory does not exist.");
        }
    }
}
