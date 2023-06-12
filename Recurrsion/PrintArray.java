class PrintArray {

    public static void fun(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.println(arr[index]);
        fun(arr, index - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        fun(arr, arr.length - 1);

    }
}