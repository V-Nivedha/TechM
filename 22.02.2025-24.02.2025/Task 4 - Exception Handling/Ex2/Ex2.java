public class Ex2 {
    public static void main(String[] args) {
        try {

            int n =8;
            if(n%2!=0){
                throw new Exception ("odd number");

            }
            else{
                throw new Exception("even number");
            }
        } catch (Exception e) {
            System.out.println( e);
        }
    }


}
