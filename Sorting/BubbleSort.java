
public class BubbleSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        boolean flag;
        for (int i = 0; i < n; i++) {
            int count = 0;
            flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // then swap the loop
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                    count++;
                }
            }
            if (flag == true) {
                break;
            }
            System.out.println(count);
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 14, 9, 13, 8, 6 };
        sort(arr);
        print(arr);
    }

}
