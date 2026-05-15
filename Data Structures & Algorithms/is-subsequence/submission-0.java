class Solution {
    public boolean isSubsequence(String s, String t) {
        //Two pointer approach
        //One slow pointer moving along characters of s
        //One fast pointer moving along characters of t
        //Starting at index 0, compare t.charAt(fast) to s.charAt(slow)
        //If a match, increment slow and fast
        //If not, only increment fast and slow awaits at the same position
        //If end of s is reached by the time end of t is reached, it's a subsequence, else not

        if(s.length() == 0) return true;

        int slow = 0;
        int fast = 0;

        for(int i = 0; i < t.length(); i++){
            if(s.charAt(slow) == t.charAt(fast)){
                slow++;

                if(slow == s.length()) return true;
            }

            fast++;
        }

        return false; 
    }
}