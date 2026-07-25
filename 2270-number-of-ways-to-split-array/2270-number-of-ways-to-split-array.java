class Solution {
    public int waysToSplitArray(int[] nums) {
        int ways = 0;
        long rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum += nums[i];
        }

        long leftSum = 0;
        for(int i = 0; i < nums.length-1; i++){
            leftSum += nums[i];
            rightSum -= nums[i];
            if(leftSum >= rightSum) ways++;
        }

        return ways;
    }
}