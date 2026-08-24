class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();

        // Add every starting city to the HashSet
        for (List<String> path : paths) {
            set.add(path.get(0));
        }

        // Check every destination city
        // The destination that is not a starting city is our answer
        for (List<String> path : paths) {
            if (!set.contains(path.get(1))) {
                return path.get(1);
            }
        }

        return "";
    }
}