class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int area = 0;
        int maxArea = 0;
        while(start < end){
            if(height[start] > height[end]){
                area = Math.abs(start-end) * height[end];
                end--;
            }
            else{
                area = (end - start) * height[start];
                start++;
            }
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}