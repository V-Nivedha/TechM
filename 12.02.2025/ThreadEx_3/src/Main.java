public class Main {
    public static void main(String[] args) {
        ThreadThree t1= new ThreadThree();
        t1.start();
        ThreadThree t2= new ThreadThree();
        t2.start();
        ThreadThree t3= new ThreadThree();
        t2.start();
    }
}
class ThreadThree extends Thread{
    public void run(){
        System.out.println("From threadThree");
        System.out.println("From threadThree");
        System.out.println("From threadThree");
        System.out.println("From threadThree");
        System.out.println("From threadThree");


    }
}
