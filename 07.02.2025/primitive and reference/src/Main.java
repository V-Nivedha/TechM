class primitive {

    static void modifyValues(int num, int[] arr) {
        num = num + 10;
        arr[0] = arr[0] + 10;
    }

    public static void main(String[] args) {
        int number = 5;
        int[] array = {9,5,27};


        System.out.println("Before modification:");
        System.out.println("Integer: " + number);
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        modifyValues(number, array);

        System.out.println("After modification:");
        System.out.println("Integer: " + number);
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
