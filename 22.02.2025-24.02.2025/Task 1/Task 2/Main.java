import java.util.Arrays;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {  // Added main method
        studentDetails();
    }

    public static void studentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] students = new String[n][2];
        int[] totalMarks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            students[i][0] = sc.nextLine();
            System.out.print("Enter number of subjects: ");
            int subCount = sc.nextInt();
            int total = 0;

            System.out.println("Enter marks: ");
            for (int j = 0; j < subCount; j++) {
                total += sc.nextInt();
            }
            sc.nextLine();

            students[i][1] = total + "";
            totalMarks[i] = total;
        }

        Arrays.sort(students, (a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));

        System.out.println("\nSorted Student List by Total Marks:");
        for (String[] student : students) {
            System.out.println("Name: " + student[0] + ", Total: " + student[1]);
        }
    }
}
