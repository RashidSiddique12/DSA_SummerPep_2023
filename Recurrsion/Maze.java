public class Maze {

    public static int totalPath(int i, int j, int n, int m) {
        if (i == n || j == m || i < 0 || j < 0) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        int right = totalPath(i, j + 1, n, m);
        int left = totalPath(i, j - 1, n, m);
        int down = totalPath(i + 1, j, n, m);
        int up = totalPath(i - 1, j, n, m);
        return left + right + up + down;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int ans = totalPath(0, 0, n, m);
        System.out.println(ans);

    }

}
