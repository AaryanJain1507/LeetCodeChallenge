class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int MaxFreq = 0;
        int length = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+ 1);
            MaxFreq = Math.max(MaxFreq, map.get(s.charAt(right)));
            while(right - left + 1 - MaxFreq > k){
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0)- 1);
                left++;
            }
            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}