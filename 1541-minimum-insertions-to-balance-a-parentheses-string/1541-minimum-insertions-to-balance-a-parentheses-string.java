class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                if(i+1 >= s.length() || s.charAt(i+1) != ')'){
                    insertions++;
                }
                else{
                    i++;
                }

                if(open > 0){
                    open--;
                }
                else{
                    insertions++;
                }
            }
        }
        insertions += open * 2;

        return insertions;
    }
}