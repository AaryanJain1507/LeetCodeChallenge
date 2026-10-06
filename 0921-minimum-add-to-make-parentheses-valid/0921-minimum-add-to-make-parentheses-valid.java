class Solution {
    public int minAddToMakeValid(String s) {

        int balance = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                balance++;
            } 
            else {
                balance--;

                if (balance < 0) {
                    count++;
                    balance = 0;
                }
            }
        }

        count += balance;

        return count;
    }
}