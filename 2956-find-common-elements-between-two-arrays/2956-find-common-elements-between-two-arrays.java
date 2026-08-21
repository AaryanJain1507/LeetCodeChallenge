class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int count1 = 0;
        int count2 = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums2) {
            set.add(num);
        }

        for (int num : nums1) {
            if (set.contains(num)) {
                count1++;
            }
        }
        
        set.clear();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}