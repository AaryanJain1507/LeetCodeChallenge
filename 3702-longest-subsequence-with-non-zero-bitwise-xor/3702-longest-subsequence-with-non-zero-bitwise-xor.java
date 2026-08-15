class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean hasNonZero = false;
        for(int num : nums){
            xor^=num;

            if(num!=0){
                hasNonZero = true;
            }
        }
        if(xor!=0){
            return nums.length;
        }
        else if( xor == 0 && hasNonZero == true){
            return nums.length - 1;                     
        }
        else{
            return 0;
        }
    }
}

// nums.length - 1;   because if xor of some numbera is 0 and there is a non zero number from them then xor of remaining number after removing that nonZero number will always be non zero