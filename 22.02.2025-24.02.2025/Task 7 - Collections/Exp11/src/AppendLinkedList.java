
import java.util.LinkedList;
import java.util.Scanner;

public class AppendLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Original LinkedList: " + list);
        System.out.print("Enter the element to append: ");
        String newElement = scanner.nextLine();
        list.addLast(newElement);

        System.out.println("Updated LinkedList: " + list);

        scanner.close();
    }
}
