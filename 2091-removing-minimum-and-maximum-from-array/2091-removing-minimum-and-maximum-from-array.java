class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        // Find the positions of the minimum and maximum
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Make minIndex the smaller index and maxIndex the larger index
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        // Both removed from the front
        int front = maxIndex + 1;

        // Both removed from the back
        int back = n - minIndex;

        // Smaller one from the front, larger one from the back
        int mixed = (minIndex + 1) + (n - maxIndex);

        return Math.min(front, Math.min(back, mixed));
    }
}