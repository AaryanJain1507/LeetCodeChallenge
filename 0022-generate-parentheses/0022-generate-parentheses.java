import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        pare(n, 0, 0, "", ll);
        return ll;
    }

    public static void pare(int n, int op, int c1, String ans, List<String> ll) {
        if (op == n && c1 == n) {
            ll.add(ans);
            return;
        }
        if (op < n) {
            pare(n, op + 1, c1, ans + "(", ll);
        }
        if (c1 < op) {
            pare(n, op, c1 + 1, ans + ")", ll);
        }
    }
}