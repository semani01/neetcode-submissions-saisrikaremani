class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L = 0, length = 0;
        HashSet<Character> window = new HashSet<>();

        for(int R = 0; R < s.length(); R++){
            while(window.contains(s.charAt(R))){ //while because, say string = abcabcabb
                window.remove(s.charAt(L));
                L++;
            }

            window.add(s.charAt(R));
            length = Math.max(length, R - L + 1);
        }


        if(length == 0 && s.length() > 0){
           return 1; 
        }

        return length;
    }
}
