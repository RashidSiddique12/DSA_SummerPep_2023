public class SprialMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }, };
        int n = mat.length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        while (left <= right && top <= bottom) {

            // print ==top
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }

            top++;
            // print == right
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            // print == bottom
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            // print == left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }

        }
    }
}
