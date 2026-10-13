class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] squares = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            squares[i] = nums[i] * nums[i];
        }
        Arrays.sort(squares);
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length / 2){
                sum -= squares[i];
            }
            else{
                sum += squares[i];
            }
        }
        return sum;
    }
}