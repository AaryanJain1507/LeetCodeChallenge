class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;

        for (int weight : weights) {
            start = Math.max(start, weight);
            end += weight;
        }
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int day = daysNeeded(weights, mid);

            if(day > days){
                start = mid + 1;
            }
            else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight <= capacity) {
                currentLoad += weight;
            } else {
                days++;
                currentLoad = weight;
            }
        }
        return days;
    }
}