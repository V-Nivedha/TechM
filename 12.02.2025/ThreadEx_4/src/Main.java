public class Main {
    public static void main(String[] args) {


        ThreadRunable1 r1=new ThreadRunable1();
        Thread t1= new Thread(r1);
        t1.start();
    }
}


class ThreadRunable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("From Thread Runnabl1");
        System.out.println("From Thread Runnabl1");
    }
}
