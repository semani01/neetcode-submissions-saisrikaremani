class Solution {
    public void reverseString(char[] s) {
        //Iterate over the array with two pointers
        // - One pointer at the beginning and one at the end
        // - With each iteration, swap the contents 
        if(s.length == 0) return;


        int l = 0, r = s.length - 1;
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
    }
}