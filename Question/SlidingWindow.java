import java.util.ArrayList;

class SlidingWindow {

    public static ArrayList<Integer> slideWindow(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                max = Math.max(max, arr[j + i]);
            }
            list.add(max);
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 4, 8, 2, 9, 12, 0 };
        int k = 3;
        ArrayList<Integer> res = slideWindow(arr, k);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }

    }
}
