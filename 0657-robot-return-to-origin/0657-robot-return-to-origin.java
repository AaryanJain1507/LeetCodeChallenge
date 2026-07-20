class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'U') x++;
            else if(ch == 'D') x--;
            else if(ch == 'R') y++;
            else{
                y--;
            }
        }
        if(x == 0 && y == 0) return true;
        else{
            return false;
        }
    }
}