class Solution {
    public List<String> letterCombinations(String digits) {
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder current = new StringBuilder();
        List<String> result = new ArrayList<>();
        if(digits.isEmpty()) return result;
        solve(digits, 0, current, result, arr);
        return result;
    }

    void solve(String digits, int index, StringBuilder current, List<String> result, String[] arr){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }
        String mapping = arr[digits.charAt(index) - '0'];

        for(int i = 0;i<mapping.length();i++){
            solve(digits, index + 1, current.append(mapping.charAt(i)), result, arr);
            current.deleteCharAt(current.length()-1);
        }
    }
}