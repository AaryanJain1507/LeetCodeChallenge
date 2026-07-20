class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] customers: accounts){
            int wealth = 0;
            for(int money : customers){
                wealth+=money;
            }
            maxWealth = Math.max(wealth, maxWealth);
        }
        return maxWealth;
    }
}