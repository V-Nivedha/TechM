import java.util.ArrayList;
import java.util.List;

class PrimeSumThread extends Thread {
    private int a, b;
    private long sum = 0;

    public PrimeSumThread(int start, int end) {
        this.a = start;
        this.b = end;
    }

    public void run() {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class PrimeCal {
    public static void main(String[] args) {
        int limit = 100;
        int Threads = 4;
        int range = limit / Threads;

        List<PrimeSumThread> threads = new ArrayList<>();
        int start = 1;


        for (int i = 0; i < Threads; i++) {
            int end = (i == Threads - 1) ? limit : start + range - 1;
            PrimeSumThread thread = new PrimeSumThread(start, end);
            threads.add(thread);
            thread.start();
            start = end + 1;
        }


        int totalSum = 0;
        for (PrimeSumThread thread : threads) {
            try {
                thread.join();
                totalSum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers " + totalSum);
    }
}
