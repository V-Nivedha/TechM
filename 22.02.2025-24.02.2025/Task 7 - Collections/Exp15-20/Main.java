import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        insertAtSpecifiedPosition();
        insertAtFirstAndLast();
        insertAtFront();
        insertAtEnd();
        insertMultipleAtPosition();
        findFirstAndLastOccurrence();
    }





    public static void insertAtSpecifiedPosition() {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 4, 5));
        System.out.println("\nBefore Insertion: " + list);
        list.add(2, 3);
        System.out.println("After Insertion: " + list);
    }

    public static void insertAtFirstAndLast() {
        LinkedList<Integer> list = new LinkedList<>(List.of(2, 3, 4));
        System.out.println("\nBefore Insertion: " + list);
        list.addFirst(1);
        list.addLast(5);
        System.out.println("After Insertion: " + list);
    }


    public static void insertAtFront() {
        LinkedList<Integer> list = new LinkedList<>(List.of(2, 3, 4));
        System.out.println("\nBefore Insertion: " + list);
        list.addFirst(1);
        System.out.println("After Insertion: " + list);
    }


    public static void insertAtEnd() {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3));
        System.out.println("\nBefore Insertion: " + list);
        list.addLast(4);
        System.out.println("After Insertion: " + list);
    }

    public static void insertMultipleAtPosition() {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 4, 5));
        System.out.println("\nBefore Insertion: " + list);
        list.addAll(1, List.of(2, 3));
        System.out.println("After Insertion: " + list);
    }


    public static void findFirstAndLastOccurrence() {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 2, 4, 2, 5));
        System.out.println("\nList: " + list);
        System.out.println("First occurrence of '2': " + list.indexOf(2));
        System.out.println("Last occurrence of '2': " + list.lastIndexOf(2));
    }
}
