
public class BasicUsingMatrix {

    public static void addEle(int[][] mat, int u, int v) {
        mat[u][v] = 1;
    }

    public static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] mat = new int[n][n];

        addEle(mat, 0, 1);
        addEle(mat, 0, 4);
        addEle(mat, 1, 2);
        addEle(mat, 2, 3);
        addEle(mat, 3, 2);
        addEle(mat, 3, 5);
        addEle(mat, 4, 2);
        addEle(mat, 4, 5);
        addEle(mat, 5, 4);
        addEle(mat, 5, 3);
        print(mat);

    }
}
