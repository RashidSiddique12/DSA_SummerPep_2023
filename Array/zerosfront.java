
public class zerosfront {

    public static void frontzeros(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] != 0) {
                j--;
            } else {
                swap(arr, i, j);
            }
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 0, 4, 5, 7, 0, 8, 0 };
        frontzeros(arr);
        print(arr);
    }

}
