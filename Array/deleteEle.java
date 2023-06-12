package Array;

class deleteEle {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printarr(arr, arr.length);
        int n = deleteEle(arr, 2);
        printarr(arr, n);

    }

    public static void printarr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(+arr[i] + " ");
        }
        System.out.println();
    }

    public static int deleteEle(int arr[], int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr.length - 1;
    }

}
