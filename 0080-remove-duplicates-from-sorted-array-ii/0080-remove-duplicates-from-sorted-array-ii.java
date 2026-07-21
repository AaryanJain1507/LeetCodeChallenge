class Solution {
    public int removeDuplicates(int[] nums){
        int count = 1;
        int write = 1;
        if(nums.length == 1) return nums.length;
        if(nums.length == 2) return nums.length;
        if(nums.length == 0) return nums.length;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count < 3){
                    nums[write] = nums[i];
                    write++;
                }
            }
            else{
                count = 1;
                nums[write] = nums[i];
                write++;
            }
        }
        return write;
    }
}