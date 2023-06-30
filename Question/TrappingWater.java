class TrappingWater {
    public static void find(int[] arr) {
        int n = arr.length;
        int left[] = new int[n];
        left[0] = arr[0];
        int temp1 = arr[0];
        int right[] = new int[n];
        right[n - 1] = arr[n - 1];
        int temp2 = arr[n - 1];
        for (int i = 1, j = n - 2; i < n & j >= 0; i++, j--) {
            if (arr[i] > temp1) {
                temp1 = arr[i];
                left[i] = temp1;
            } else {
                left[i] = temp1;
            }

            if (arr[j] > temp2) {
                temp2 = arr[j];
                right[j] = arr[j];
            } else {
                right[j] = temp2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println();

        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.println(water);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 2, 2, 2 };
        find(arr);
    }
}