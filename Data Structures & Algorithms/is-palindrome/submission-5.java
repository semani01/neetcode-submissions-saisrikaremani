class Solution {
    public boolean isPalindrome(String s) {
        //Step 1: Normalize the string
        //- Lowercase
        //- Remove non-alphanumeric characters and whitespaces

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        //Step 2: Perform a two pointer check 
        //- L at 0 and R at s.length() - 1
        //- Valid Palindrome is both are equal at every iteration
        int L = 0, R = s.length() - 1;
        while(L <= R){  // "=" to include the edge case of a single character
          if(s.charAt(L) != s.charAt(R)){
            return false;
          }

          L++;
          R--;
        }

        //valid palindrome
        return true;
    }
}
