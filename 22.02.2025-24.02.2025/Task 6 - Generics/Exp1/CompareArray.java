class CompareArrays {
    public static <T> boolean areArraysEqual(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {5,6,7};
        Integer[] array2 = {5,6,7};
        Integer[] array3 = {12,58,89};

        System.out.println(areArraysEqual(array1, array2));
        System.out.println(areArraysEqual(array1, array3));
    }
}
