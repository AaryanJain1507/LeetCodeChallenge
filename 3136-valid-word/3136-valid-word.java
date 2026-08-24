class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean vowel = false;
        boolean consonant = false;
        for(char ch : word.toCharArray()){
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (isVowel(ch)) {
                vowel = true;
            } else if (Character.isLetter(ch)) {
                consonant = true;
            }
        }
        return vowel && consonant;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U';
    }
}