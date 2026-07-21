class Solution {
    public int compress(char[] chars) {
        int i = 0; //this is for reading
        int w = 0; // this is for writing

        while(i < chars.length){
            char curr = chars[i]; //idhar "a" aa gya 
            int count = 0;

            while(i < chars.length && chars[i] == curr){ //this will keep on going till we find a diff character
                i++;
                count++;
            }

            chars[w++] = curr; //written "a" in the array

            if(count > 1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[w++] = c; // to write the count of "a"
                }
            }
        }
        return w;
    }
}