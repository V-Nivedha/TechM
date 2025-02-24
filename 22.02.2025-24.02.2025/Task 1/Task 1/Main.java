public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,78,56};
        int arr1[]= new int[(arr.length)/2];
        int j =0;
        for(int i =0;i<arr.length;i=i+2)
        {
            arr1[j]=arr[i];
            j++;
        }
        for (int x :arr1){
            System.out.print(x+" ");
        }
    }
}