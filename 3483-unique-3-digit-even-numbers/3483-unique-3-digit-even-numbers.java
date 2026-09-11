class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> seen = new HashSet<>();

        for(int h = 0; h < n; h++){
            if(digits[h] == 0) continue;

            for(int t = 0; t < n; t++){
                if(t == h) continue;

                for(int u = 0; u < n; u++){
                    if(u == t || u == h) continue;

                    if(digits[u] % 2 != 0) continue;

                    int num = digits[h] * 100 + digits[t] * 10 + digits[u];
                    seen.add(num);
                }
            }
        }
        return seen.size();
    }
}