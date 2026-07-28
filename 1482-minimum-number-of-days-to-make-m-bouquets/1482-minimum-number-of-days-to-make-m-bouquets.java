class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length)
            return -1;
        int start = 1;
        int end = 0;
        for(int num : bloomDay){
            end = Math.max(end, num);
        }
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int bouquets = bouquetsMade(bloomDay, k, mid);
            if(bouquets >= m){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            } 
        }
        return ans;
    }
    public int bouquetsMade(int[] bloomDay, int k, int day){
        int bouquets = 0;
        int flower = 0;
        for(int num : bloomDay){
            if(num <= day){
                flower++;
                if(flower == k){
                    bouquets++;
                    flower = 0;
                }
            }
            else{
                flower = 0;
            }
        }
        return bouquets;
    }
}