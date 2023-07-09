import java.util.ArrayList;
import java.util.Scanner;

public class TakingDataFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of row : ");
        int n = sc.nextInt();
        System.out.println("Number of colom");
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> List = new ArrayList<ArrayList<Integer>>();

        // int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                // System.out.print("Entre Element of " + i + " row and " + j + " colom : ");
                l.add(sc.nextInt());
                // mat[i][j] = sc.nextInt();
            }
            List.add(l);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(List.get(i, j));
                // System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
