class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int friend : friends){
            set.add(friend);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : order){
            if(set.contains(num)){
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}