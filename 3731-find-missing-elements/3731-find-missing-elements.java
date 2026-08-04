class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean[] present = new boolean[101];
        for(int num : nums){
            present[num] = true;
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        for(int i = min + 1; i < max; i++){
            if(!present[i]){
                list.add(i);
            }
        }
        return list;
    }
}