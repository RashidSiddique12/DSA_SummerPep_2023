public class Rotate270Degree {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = mat.length;
        int[][] rotatedMat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMat[n - 1 - j][i] = mat[i][j];
                // rotatedMat[i][j] = mat[j][n - 1 - i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
