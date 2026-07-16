class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currentCount = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                currentCount = currentCount * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(currentCount);
                stringStack.push(currentString);

                currentCount = 0;
                currentString = "";
            }

            else if (ch == ']') {
                int count = countStack.pop();
                String previous = stringStack.pop();

                StringBuilder repeated = new StringBuilder();

                for (int i = 0; i < count; i++) {
                    repeated.append(currentString);
                }

                currentString = previous + repeated.toString();
            }

            else {
                currentString += ch;
            }
        }

        return currentString;
    }
}