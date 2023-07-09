
import java.util.HashMap;

class SameElementInAllRow {
    public static void main(String[] args) {
        int[][] mat = { { 2, 7, 3, 3 }, { 1, 7, 9, 2 }, { 6, 7, 3, 2 }, { 6, 9, 9, 2 } };
        int n = mat.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int j = 0; j < n; j++) {
            map.put(mat[0][j], 1);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map.containsKey(mat[i][j]) && map.get(mat[i][j]) == i) {
                    map.put(mat[i][j], map.getOrDefault(mat[i][j], 0) + 1);
                } else {
                    map.put(mat[i][j], 1);
                }

                if (i == n - 1 && map.get(mat[i][j]) == n) {
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}

// if not dulicate element present in the matrix

// import java.util.HashMap;

// public class SameElementInAllRow {
// public static void main(String[] args) {
// int[][] mat = { { 1, 2, 3 }, { 4, 5, 3 }, { 3, 8, 9 } };
// int n = mat.length;
// HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// map.put(mat[i][j], map.getOrDefault(mat[i][j], 0) + 1);

// if (i == n - 1 && map.get(mat[i][j]) == n) {
// System.out.println(mat[i][j]);
// }

// }
// }

// // for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
// // int key = entry.getKey();
// // int val = entry.getValue();

// // // System.out.println("hello");
// // if (val == n) {
// // System.out.println(key);
// // break;
// // }
// // }
// }
// }
