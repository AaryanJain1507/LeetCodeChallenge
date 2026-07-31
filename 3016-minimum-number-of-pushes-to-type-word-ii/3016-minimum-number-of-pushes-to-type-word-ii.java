class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int start = 0;
        int end = freq.length - 1;

        while (start < end) {
            int temp = freq[start];
            freq[start] = freq[end];
            freq[end] = temp;
            start++;
            end--;
        }

        int ans = 0;

        for (int i = 0; i < freq.length; i++) {
            ans += freq[i] * ((i / 8) + 1);
        }

        return ans;
    }
}