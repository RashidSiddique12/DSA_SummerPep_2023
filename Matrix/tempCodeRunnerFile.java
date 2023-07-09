import java.util.Scanner;

public class TakingDataFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of row : ");
        int n = sc.nextInt();
        System.out.println("Number of colom");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]);
            }
        }
    }
}
