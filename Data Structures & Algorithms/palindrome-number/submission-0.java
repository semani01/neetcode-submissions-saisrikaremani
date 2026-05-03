class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);

            if(leftChar != rightChar){
                return false;
            }

            left++;
            right--;
        } 

        return true;
    }
}