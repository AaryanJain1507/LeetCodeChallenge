class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            // Is the last bit a 1?
            count += n & 1;

            // Shift n right
            n = n >>> 1;
        }

        return count;
    }
}