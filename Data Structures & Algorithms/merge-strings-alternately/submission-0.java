class Solution {
    public String mergeAlternately(String word1, String word2) {
        //Brute Force
        //L pointer at word1.charAt(0) and R pointer at word2.charAt(0)
        //Loop until the shortest word length --> for(int i = 0; i < len; i++)
        //Each iteration alternate based on odd(word1) or even(word2) 
        //After loop end, if L <= word1.length() - 1 append all remaining chars
        // if R <= word2.length() - 1 append all remaining chars

        int L = 0, R = 0;
        //System.out.println("L: " + L + " | R: " + R);

        int shortestLength = word1.length() < word2.length() ? word1.length() : word2.length();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < shortestLength; i++){
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            L++;
            R++;
        }

        if(L <= word1.length() - 1){
            res.append(word1.substring(L));
        }

        if(R <= word2.length() - 1){
            res.append(word2.substring(R));
        }
        
        return res.toString();
    }
}