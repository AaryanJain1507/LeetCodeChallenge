class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0] = 0;
        for(int i = 1; i<=gain.length; i++){
            prefix[i] = gain[i-1] + prefix[i-1];
        }
        int max = 0;
        for(int j = 0; j<prefix.length; j++){
            if(prefix[j]>max){
                max = prefix[j];
            }
        }
        return max;
    }
}