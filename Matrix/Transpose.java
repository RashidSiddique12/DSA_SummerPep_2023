public class Transpose {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // int[][] trans = new int[n][n];
        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j < n; j++) {
        // trans[j][i] = mat[i][j];
        // }
        // }

        // Print

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
