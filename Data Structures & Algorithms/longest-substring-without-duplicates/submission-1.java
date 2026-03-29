class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L = 0, length = 0;
        HashSet<Character> window = new HashSet<>();

        for(int R = 0; R < s.length(); R++){
            if(!window.contains(s.charAt(R))){
                window.add(s.charAt(R));
                length = Math.max(length, R - L + 1);
            } 
            else{
                window.clear();
                L++;
                R = L - 1;
            }
        }


        if(length == 0){
           return 0; 
        }

        return length;
    }
}
