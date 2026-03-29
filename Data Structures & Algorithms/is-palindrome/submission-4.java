class Solution {
    public boolean isPalindrome(String s) {
       /*1. Normalize the string: 
            -lowercase
            -remove non-alphanumerics
            -remove whitespaces
       */
       System.out.println(s);
       s = s.toLowerCase();
       s = s.replaceAll("[^a-z0-9]", "");

       //2. Perform a single pass with two pointers --> O(n)
       int L = 0, R = s.length()-1;
       while(L < R){
          if(s.charAt(L) != s.charAt(R)){
            return false;
          }
          L++;
          R--;
        } 
        
        //if loop successful, s is a valid palindrome
        return true;
    }
}
