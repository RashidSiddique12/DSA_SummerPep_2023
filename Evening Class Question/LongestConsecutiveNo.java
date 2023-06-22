import java.util.*;

class LongestConsecutiveNo {

    public static int consecutiveNo(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 0)
            return 0;

        int n = 1;
        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i] + 1 == nums[i + 1]) {
                n++;
                max = Math.max(max, n);
            } else {
                n = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        System.out.println(consecutiveNo(arr));
    }

}
