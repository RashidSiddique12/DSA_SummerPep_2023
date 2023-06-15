public class LinerSearch {

    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                arr[i] = 1;
            } else if (arr[i] % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = -1;
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 11, 15 };
        change(arr);
        print(arr);
    }

}
