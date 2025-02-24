import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(" string comparison  Using equals(): " + Objects.equals(str1, str2));
        System.out.println("string comparison Using deepEquals(): " + Objects.deepEquals(str1, str2));


        int[] arr1 = {1, 2, 3};
        int [] arr2 = {1, 2, 3};

        System.out.println("integer array comparison Using equals(): " + Objects.equals(arr1, arr2));
        System.out.println("integer array comparison Using deepEquals(): " + Objects.deepEquals(arr1, arr2));



    }
}