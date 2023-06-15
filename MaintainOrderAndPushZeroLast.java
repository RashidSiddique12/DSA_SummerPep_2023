public class MaintainOrderAndPushZeroLast {
    public static void arrange(int arr[]) {
        int j = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for (j = j; j < n; j++) {
            arr[j] = 0;

        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 0, 5, 0, 4, 0 };
        arrange(arr);
        print(arr);
    }

}
