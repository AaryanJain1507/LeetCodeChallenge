class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        solve(candidates, target, 0, current, result, 0);
        return result;
    }

    void solve(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result, int currentSum){
        if(currentSum>target){
            return;
        }
        if(index>=candidates.length){
            return;
        }
        if(currentSum == target){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(candidates[index]);
        solve(candidates, target, index, current, result, currentSum + candidates[index]);
        current.remove(current.size() - 1);
        solve(candidates, target, index + 1, current, result, currentSum);
    }
}