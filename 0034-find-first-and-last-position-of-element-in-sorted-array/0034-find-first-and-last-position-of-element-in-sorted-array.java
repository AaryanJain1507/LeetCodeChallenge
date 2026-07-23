class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        result[0] = start;
        result[1] = end;

        return result;
        
        }
        int search(int[] nums, int target, boolean findfirstOccurence){
        int result = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]<target){
                start = mid + 1;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else{
                result = mid;
                if(findfirstOccurence == true){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}