package Array;

class InsertEle {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 0 };

        for (int i = 4; i >= 0; i--) {
            arr[i + 1] = arr[i];
            if (i == 1) {
                arr[i] = 20;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
