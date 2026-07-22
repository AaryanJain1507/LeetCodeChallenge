class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int closestSum = 0;
        for(int k = 0; k < nums.length - 2; k++){
            int i = k + 1;
            int j = nums.length - 1;
            while(i < j){
                int sum = nums[i] + nums[j] + nums[k];

                if(Math.abs(sum - target)<diff){
                    diff = Math.abs(sum - target);
                    closestSum = sum;
                }
                if(sum == target){
                    return target;
                }
                else if(sum > target){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return closestSum;
    }
}