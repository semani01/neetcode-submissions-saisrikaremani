class Solution {
    public int lengthOfLastWord(String s) {
        //Phase 1: Start from end, decrement pointer to the last word(to skip over spaces)
        int i = s.length() - 1, len = 0;

        while(s.charAt(i) == ' '){
            i--;
        }

        //Phase 2: Until beginning of string is reached(single word) or until end of word(decrement pointer and increment length)
        while(i >= 0 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        return len;        
    }
}