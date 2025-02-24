import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        int arr[]={23,56,89,90,34,35,5,9,12,45};
        int copiedarry[]=Arrays.copyOfRange(arr,3,6);
        System.out.println("orginalarray "+Arrays.toString(arr));
        System.out.println("copiedarray "+Arrays.toString(copiedarry));
    }
}