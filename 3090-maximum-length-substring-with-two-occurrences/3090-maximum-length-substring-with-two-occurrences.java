class Solution {
    public int maximumLengthSubstring(String s) {
        int length = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while(map.get(s.charAt(right))>2){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}