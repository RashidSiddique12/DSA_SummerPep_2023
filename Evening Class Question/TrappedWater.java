
public class TrappedWater {

    public static int maxWater(int[] arr) {
        int n = arr.length;
        int res = 0;

        for (int i = 1; i < n; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            res += Math.min(left, right) - arr[i];
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println(maxWater(arr));
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
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
}