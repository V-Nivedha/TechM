public class Main {
    public static void main(String[] args) {
        ThreadOne t2= new ThreadOne();
        t2.start();

    }
}
class ThreadOne extends Thread{
    public void run(){
        System.out.println("From ThreadOne");
        System.out.println("From ThreadOne");
        System.out.println("From ThreadOne");

    }
}