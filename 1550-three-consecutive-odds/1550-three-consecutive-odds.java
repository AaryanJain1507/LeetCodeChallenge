class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        // for(int  i = 0; i < arr.length - 2; i++){
        //     if(arr[i] % 2 == 1 &&
        //        arr[i+1] % 2 == 1 &&
        //        arr[i+2] % 2 == 1) return true;
        // }
        // return false;
        int consecutiveOdds = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                consecutiveOdds++;
            }
            else{
                consecutiveOdds = 0;
            }

            if(consecutiveOdds == 3){
                return true;
            }
        }
        return false;

    }
}