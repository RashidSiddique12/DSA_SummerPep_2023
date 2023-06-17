public class MergTwoArray {

    public static void merg(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int newarr[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                newarr[k++] = arr1[i++];
            } else {
                newarr[k++] = arr2[j++];
            }
        }

        while (i < n) {
            newarr[k++] = arr1[i++];
        }
        while (j < m) {
            newarr[k++] = arr2[j++];
        }

        for (int z = 0; z < n + m; z++) {
            System.out.print(newarr[z] + " ");
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 4, 5, 17, 20, 22 };
        int arr2[] = { 2, 3, 8, 15, 19, 29, 39, 50 };
        merg(arr1, arr2);
    }
}
