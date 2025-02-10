public class Main {
    public static void main(String[] args) {
        printMethod();
        printlnMethod();
        Main obj1= new Main();
        obj1.errMethod();
    }
    public static void printMethod(){
        System.out.println("PrintMethod is called ");
    }
    public static void printlnMethod(){
     System.out.println("PrintlnMethod is called ");
    }
    public void errMethod(){
        System.err.print("errMethod is called ");
    }
}