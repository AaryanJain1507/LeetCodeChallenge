class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<Integer> current = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    solve(nums, 0, current, result);
    return result;
}

    static void solve(int[] nums, int index, List<Integer> current, List<List<Integer>> result){
        if(index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        solve(nums, index+1, current, result);
        current.add(nums[index]);
        solve(nums, index+1, current, result);
        current.remove(current.size()-1);

    }
}