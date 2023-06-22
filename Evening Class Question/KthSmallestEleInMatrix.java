import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestEleInMatrix {
    public static int findSmallestEle(int[][] matrix, int k) {

        int n = matrix.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxHeap.offer(matrix[i][j]);
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();

    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        int target = 8;
        System.out.println(findSmallestEle(matrix, target));
    }

}
