public class MergSort {

    public static void merg(int[] arr, int l, int mid, int h) {
        int n = mid - l + 1;
        int m = h - mid;

        int L[] = new int[n];
        int R[] = new int[m];

        for (int i1 = 0; i1 < n; i1++) {
            L[i1] = arr[l + i1];
        }
        for (int j1 = 0; j1 < m; j1++) {
            R[j1] = arr[mid + 1 + j1];
        }

        // Now last merg L & R In arr
        int i = 0, j = 0;
        int k = l;
        while (i < n && j < m) {
            if (L[i] <= R[j]) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
            k++;
        }

        while (i < n) {
            arr[k++] = L[i++];
        }

        while (j < m) {
            arr[k++] = R[j++];
        }

    }

    public static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, h);

            merg(arr, l, mid, h);
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 9, 14, 12, 1, 34, 3, 6, 89 };
        int l = 0;
        int h = arr.length - 1;
        sort(arr, l, h);

        print(arr);
    }

}
