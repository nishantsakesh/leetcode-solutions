class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int idx = java.util.Arrays.binarySearch(dp, 0, len, num);
            if (idx < 0) {
                idx = -idx - 1;
            }
            dp[idx] = num;
            if (idx == len) {
                len++;
            }
        }
        return len;
    }
}
