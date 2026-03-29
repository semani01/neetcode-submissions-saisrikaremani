class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 1; i < s.length(); i++){
            char character1 = s.charAt(i);
            char character0 = s.charAt(i - 1);
            int asciiValue1 = (int) character1;
            int asciiValue0 = (int) character0; 
            score += Math.abs(asciiValue1 - asciiValue0);
        }

        return score;
    }
}