public class Main {
    public static void main(String[] args) {


        ThreadRunable2 r1=new ThreadRunable2();
        Thread t1= new Thread(r1);

        t1.start();
        Thread tt1 = new Thread(new ThreadRunable2());
        tt1.start();
    }
}


class ThreadRunable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("From Thread Runnable2");
        System.out.println("From Thread Runnable2");
        System.out.println("From Thread Runnable2");
    }
}
