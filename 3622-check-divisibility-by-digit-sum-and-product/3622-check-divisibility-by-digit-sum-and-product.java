class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int original = n;
        while(n!=0){
            int digit = n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        int total = sum + prod;
        return original % total == 0;
    }
}