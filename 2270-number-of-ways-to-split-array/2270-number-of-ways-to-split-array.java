class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long[] leftSum = new long[n + 1];
        long[] rightSum = new long[n + 1];

        leftSum[0] = 0;
        rightSum[n - 1] = 0;

        for (int i = 1; i <= n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (leftSum[i] + nums[i] >= rightSum[i]) {
                count++;
            }
        }

        return count;
    }
}