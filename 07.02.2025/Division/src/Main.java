public class Main {
    public static void divideWithoutOperators(int dividend, int divisor) {
        int quotient = 0;
        int remainder = dividend;


        while (remainder >= divisor) {
            remainder = remainder - divisor;
            quotient = quotient + 1;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 3;

        divideWithoutOperators(dividend, divisor);
    }
}
