class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int num : asteroids) {
            boolean alive = true;

            while (alive && !stack.isEmpty() && stack.peek() > 0 && num < 0) {

                if (stack.peek() < Math.abs(num)) {
                    stack.pop();
                }
                else if (stack.peek() == Math.abs(num)) {
                    stack.pop();
                    alive = false;
                }
                else {
                    alive = false;
                }
            }

            if (alive) {
                stack.push(num);
            }
        }

        int[] ans = new int[stack.size()];
        int i = 0;

        for (int num : stack) {
            ans[i++] = num;
        }

        return ans;
    }
}