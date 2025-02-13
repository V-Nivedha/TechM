import java.util.*;

public class CollectionExample {
public static void main(String[] args) throws Exception{
    ArrayListEx a=new ArrayListEx();
    LinkedListEx l = new LinkedListEx();
    VectorEx v = new VectorEx();
    StackEx s = new StackEx();
    a.start();
    a.join();
    l.start();
    l.join();
    v.start();
    v.join();
    s.start();
    s.join();

}}

class ArrayListEx extends Thread{
   public void run(){
       System.out.println("\n\n Running from Arraylist Thread");
       System.out.println("------------------------------");
   List<Integer> list1 = new ArrayList<>();

    list1.add(35);
    list1.add(23);
    list1.add(67);
    list1.add(82);
    list1.add(56);
    list1.add(49);
    list1.add(49);
    list1.add(49);
    System.out.println("Is list1 empty? "+list1.isEmpty());
      System.out.println("The given list is:"+list1);
    System.out.println("Number of elements in the list: "+list1.size());

    list1.add(12);
    System.out.println("After adding one element:");
    System.out.println("The given list is :"+list1);
    System.out.println("The number of elements in the list: "+list1.size());

    System.out.println("Is 566 available in the list:"+list1.contains(566));
    System.out.println("The given list before removing elements is :"+list1);


    list1.remove(2);
    list1.remove(3);
    System.out.println("After removing elements:");
    System.out.println("The given list is :"+list1);
    System.out.println("The number of elements in the list: "+list1.size());

}}
class LinkedListEx extends Thread{
    public void run(){
        System.out.println(" \n\nRunning from Linkedlist Thread");
        System.out.println("------------------------------");
        List<Integer> list1 = new LinkedList<>();

        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? "+list1.isEmpty());
        System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+list1.size());

        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());

        System.out.println("Is 566 available in the list:"+list1.contains(566));
        System.out.println("The given list before removing elements is :"+list1);


        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
    }
}
class VectorEx extends Thread{
    public void run(){
        System.out.println("\n\n Running from Vector Thread");
        System.out.println("------------------------------");
        List<Integer> list1 = new Vector<>();

        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? "+list1.isEmpty());
        System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+list1.size());

        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());

        System.out.println("Is 566 available in the list:"+list1.contains(566));
        System.out.println("The given list before removing elements is :"+list1);


        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
    }
}
class StackEx extends Thread{
    public void run(){
        System.out.println(" \n\nRunning from Stack Thread");
        System.out.println("------------------------------");
        List<Integer> list1 = new Stack<>();

        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        System.out.println("Is list1 empty? "+list1.isEmpty());
        System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+list1.size());

        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());

        System.out.println("Is 566 available in the list:"+list1.contains(566));
        System.out.println("The given list before removing elements is :"+list1);


        list1.remove(2);
        list1.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
    }
}