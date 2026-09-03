class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums1.length; i++){
            min = Math.min(min, nums1[i]);
        }
        if(min % 2 != 0){
            return true;
        }
        else{
            for(int i = 0; i < nums1.length; i++){
                if(nums1[i] % 2 != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
// ok so the basic logic behind it is,  if the smallest number is odd;
// we can subtract it from any number and make them odd as : odd - odd = odd;
//                                                           even - odd = odd;
// and if the smallest number is even then the whole array needs to be even; 