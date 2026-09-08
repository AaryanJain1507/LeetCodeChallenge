class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0; 
        int right = 0; 
        int MaxLength = 0;
        while(right < s.length()){
            if(set.contains(s.charAt(right))==false){
                set.add(s.charAt(right));
                right++;
                MaxLength = Math.max(MaxLength, set.size());
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return MaxLength;
        // int ans = 0;
        // for(int i = 0; i<s.length(); i++){
        //     for(int j = i; j<s.length(); j++){
        //         String st = s.substring(i, j+1);
        //         if(check(st)){
        //             ans = Math.max(ans, st.length());
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return ans;
    }
    // public static boolean check(String st){
    //     int[] freq = new int[26];
    //     for(int i = 0; i<st.length(); i++){
    //         char ch = st.charAt(i);
    //         freq[ch - 'a']++;
    //         if(freq[ch-'a']>1){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}