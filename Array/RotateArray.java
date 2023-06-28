
class RotateArray {
    // public static void rotate(int[] arr, int d) {
    // int newarr[] = new int[d];
    // int z = 0;
    // for (int i = arr.length - d; i < arr.length; i++) {
    // newarr[z++] = arr[i];
    // }

    // int k = arr.length - 1;
    // for (int i = arr.length - d - 1; i >= 0; i--) {
    // arr[k--] = arr[i];
    // }

    // for (int i = 0; i < d; i++) {
    // arr[i] = newarr[i];
    // }

    // }
    public static void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }

    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        print(arr);

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 1;
        System.out.println("hello");
        rotate(arr, d);

    }
}
