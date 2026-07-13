class Solution {
    public boolean judgeSquareSum(int c) {
        long num = (long)Math.sqrt(c);
        long i = 0; 
        long j = num;
        while(i<=j){
            long currentSum = i*i + j*j;
            if(currentSum==c){
                return true;
            }
            else if(currentSum>c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}