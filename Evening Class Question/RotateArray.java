public class RotateArray {

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

    public static int minNo(int arr[], int d) {
        d = d % d;
        return arr[d];
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 4, 4, 5, 6, 7 };
        int d = 7;
        rotate(arr, d);
        System.out.println();
        System.err.println("Minimum no : " + minNo(arr, d));

    }
}
