class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i<k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        maxCount = count;
        for(int i = 1; i<=s.length() - k; i++){
            if (isVowel(s.charAt(i - 1))) count--;
            if (isVowel(s.charAt(i + k - 1))) count++;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o'  || ch== 'u'){
            return true;
        }
        else{
            return false;
        }
    }
}