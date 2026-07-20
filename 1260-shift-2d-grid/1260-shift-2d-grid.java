class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m*n;
        int idx = 0;
        int[] arr = new int[size];
        for(int i = 0; i<m; i++){
            for(int j = 0; j < n; j++){
                arr[idx++] = grid[i][j];
            }
        }
        int[] shifted = new int[size];
        for(int i = 0; i<size; i++){
            int newIndex = (i + k) % size;
            shifted[newIndex] = arr[i];
        }
        int index = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<m; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < n; j++){
                row.add(shifted[index++]);
            }
            ans.add(row);
        }
        return ans;
    }
}