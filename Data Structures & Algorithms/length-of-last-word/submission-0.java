class Solution {
    public int lengthOfLastWord(String s) {
        //Have a maxLength and a length variable
        //Until hitting a white space increment length variable and then compare with maxLength
        int length = 0, finalLength = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                length = 0;
                continue;
            }

            length++;
            finalLength = length;

            if(i + 1 == s.length()){
                break;
            }
        }

        return finalLength;
    }
}