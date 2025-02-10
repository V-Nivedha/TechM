public class Main {
    public static void main(String[] args) {
        User user1 = new User("nivi", 25);
        User user2 = new User("nivi", 25);
        SecondUser secondUser1 = new SecondUser("Alice", 25);
        SecondUser secondUser2 = new SecondUser("Alice", 25);


        System.out.println("User Class with toString(): " + user1);
        System.out.println("SecondUser Class without toString(): " + secondUser1);

        System.out.println("Comparing two User objects: " + user1.equals(user2));
        System.out.println("Comparing two SecondUser objects: " + (secondUser1 == secondUser2));


        System.out.println("User1 HashCode: " + user1.hashCode());
        System.out.println("User2 HashCode: " + user2.hashCode());
    }
}
