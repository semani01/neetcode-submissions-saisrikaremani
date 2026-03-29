class Solution {
    public boolean isPalindrome(String s) {
       System.out.println(s);
       //Make string lowercase and remove whitespaces
       String ns = s.toLowerCase(Locale.ROOT).replace(" ", "");

       //Remove all non-alphanumeric characters
       ns = ns.replaceAll("([^a-z0-9]+)", "").trim();

    //    System.out.println(ns);    
    //    System.out.println(ns.length());

       //Loop with two pointers, if both match continue, else immediately return false
       for(int i = 0, j = ns.length() - 1; i < j; i++, j--){
        if(ns.charAt(i) != ns.charAt(j)){
            return false;
        }
       }

       //All characters match -- is a palindrom
       return true;
    }
}
