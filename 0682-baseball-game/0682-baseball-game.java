class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack = new Stack<>();
        for(String word : operations){
            if(word.equals("C")){
                stack.pop();
            } 
            else if(word.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(word.equals("+")){
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
            }
            else{
                int num = Integer.parseInt(word);
                stack.push(num);
            }
        }
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        return sum;
    }
}