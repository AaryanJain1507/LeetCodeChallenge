class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;

        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (hoursNeeded(piles, mid) <= h) {
                ans = mid;
                end = mid - 1;
            } else if (hoursNeeded(piles, mid) > h) {
                start = mid + 1;
            }
        }

        return ans;
    }

    public long hoursNeeded(int[] piles, int k) {
        long hours = 0;

        for (int pile : piles) {
            hours += (long) (pile + k - 1) / k;  // reason in note
        }

        return hours;
    }
}