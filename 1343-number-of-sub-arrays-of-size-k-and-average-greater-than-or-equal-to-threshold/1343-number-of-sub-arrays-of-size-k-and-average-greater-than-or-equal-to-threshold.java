class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum+=nums[i];
        }
        if(sum>=k*threshold){
            count++;
        }
        for(int i = 1; i <= nums.length - k; i++){
            sum = sum - nums[i-1] + nums[i+k-1];
            if(sum>=k*threshold){
                count++;
            }
        }
        return count;
    }
}