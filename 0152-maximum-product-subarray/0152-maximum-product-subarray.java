class Solution {
    public int maxProduct(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        // int product = 1;
        //     for (int j = i; j < n; j++) {
        //         product *= nums[j];
        //         max = Math.max(max, product);
        //     }
        // }
        // return max;
        if(nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        int cmax = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                cmax = 1;
                continue;
            }
            cmax = cmax*nums[i];
            max = Math.max(cmax, max);
        }
        cmax = 1;
        for(int i = nums.length -1; i>=0; i--){
            if(nums[i] == 0){
                cmax = 1;
                continue;
            }
            cmax = cmax*nums[i];
            max = Math.max(cmax, max);
        }
        return Math.max(max, 0);
    }
}