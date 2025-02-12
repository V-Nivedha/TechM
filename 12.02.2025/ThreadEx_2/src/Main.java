public class Main {
    public static void main(String[] args) {
   ThreadTwo t2= new ThreadTwo();
   t2.start();
        ThreadTwo t3= new ThreadTwo();
        t3.start();
   t2.run();
    }
}
class ThreadTwo extends Thread{
    public void run(){
        System.out.println("From ThreadTwo");
        System.out.println("From ThreadTwo");
        System.out.println(10/0);

    }
}