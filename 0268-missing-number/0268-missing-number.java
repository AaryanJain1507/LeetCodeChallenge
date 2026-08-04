class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n+1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;

        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != i) {
        //         return i;   
        //     }
        // }
        // return nums.length;
    }
}