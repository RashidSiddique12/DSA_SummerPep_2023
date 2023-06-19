class InsertionSort {

    public static void sort(int[] arr) {
        // Insetion sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[i];
                j--;
            }
            arr[j + 1] = key;
        }

        // int n = arr.length;
        // for (int i = 1; i < n; i++) {
        // int key = arr[i];
        // // int j = i - 1;
        // int j;
        // // while (j >= 0 && arr[j] > key) {
        // // arr[j + 1] = arr[j];
        // // j--;
        // // }
        // for (j = i - 1; j >= 0; j--) {
        // if (arr[j] < key) {
        // break;
        // }
        // arr[j + 1] = arr[j];
        // }

        // arr[j + 1] = key;
        // }
    }

    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 7, 8, 9, 1, 3 };
        sort(arr);
        print(arr);
    }
}