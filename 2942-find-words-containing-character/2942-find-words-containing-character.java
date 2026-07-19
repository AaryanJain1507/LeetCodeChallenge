class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(isThere(words[i], x)){
                result.add(i);
            }
        }
        return result;
    }
    private boolean isThere(String s, char ch){
        for(char c : s.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
    }
}