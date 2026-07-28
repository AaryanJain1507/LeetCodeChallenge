class Solution {
    public String smallestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String middle = "";
        StringBuilder left = new StringBuilder();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int freq = map.getOrDefault(ch, 0);
            if(freq%2!=0) middle = ch + "";
            for (int i = 0; i < freq / 2; i++) {
                left.append(ch);
            }
        }
        String right = new StringBuilder(left).reverse().toString();
        return left.toString() + middle + right;
    }
}