package utility;

public class UtilExample {
    public static int getLength(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        num = Math.abs(num);
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}

