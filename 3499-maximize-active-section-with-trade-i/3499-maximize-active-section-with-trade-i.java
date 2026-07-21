class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int count = 1;
        List<Integer> sizes = new ArrayList<>();
        List<Character> types = new ArrayList<>();
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                sizes.add(count);
                types.add(s.charAt(i-1));
                count=1;
            }
        }
        sizes.add(count);
        types.add(s.charAt(s.length()-1));
        int bestGain = 0;
        for(int i = 1; i<sizes.size()-1; i++){
            if(types.get(i)=='1'
            && types.get(i-1)=='0'
            && types.get(i+1)=='0'){
                int gain = sizes.get(i-1)+sizes.get(i+1);
                bestGain = Math.max(gain, bestGain);
            }
        }
        int onesCount = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                onesCount++;
            }
        }
        return onesCount + bestGain;
    }
}