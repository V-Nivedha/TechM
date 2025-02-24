class MyThread extends Thread {
    public void run() {
        System.out.println("Hello, Java!");
    }
}

public class ThreadBasics
{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
