
import java.util.ArrayList;

public class LeaderEle {

    public static ArrayList leaderEle(int arr[], ArrayList<Integer> list) {
        list.add(arr[arr.length - 1]);
        int grt = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > grt) {
                list.add(arr[i]);
                grt = arr[i];
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 26, 9, 16, 12, 5, 9 };
        ArrayList<Integer> list = new ArrayList<>();
        leaderEle(arr, list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
