// class Solution {
//     public char findTheDifference(String s, String t) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(char ch : s.toCharArray()){
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         for(char ch : t.toCharArray()){
//             if(map.getOrDefault(ch, 0) >= 1){
//                 map.put(ch, map.get(ch) - 1);
//             }
//             else{
//                 return ch;
//             }
//         }
//         return ' ';
//     }
// }
class Solution {

    public char findTheDifference(String s, String t) {

        int[] count = new int[26];

        for(char ch : s.toCharArray()){
            count[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            count[ch - 'a']--;

            if(count[ch - 'a'] < 0){
                return ch;
            }
        }

        return ' ';
    }
}