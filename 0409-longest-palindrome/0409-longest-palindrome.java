class Solution {

    public int longestPalindrome(String s) {

        int[] count = new int[128];

        for(char ch : s.toCharArray()){
            count[ch]++;
        }

        int length = 0;
        boolean odd = false;

        for(int n : count){

            length += (n / 2) * 2;

            if(n % 2 == 1){
                odd = true;
            }
        }

        if(odd){
            length++;
        }

        return length;
    }
}