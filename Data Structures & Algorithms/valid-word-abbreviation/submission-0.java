class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        //Edge case: abbreviation == word
        if(word.equals(abbr)) return true;

        //Two pointer approach
        int i = 0, j = 0;

        while(i < word.length() && j < abbr.length()){
            //letters
            if(word.charAt(i) == abbr.charAt(j)){
                i++;
                j++;
            }
            // Check if the current character in abbr is a digit
            else if (Character.isDigit(abbr.charAt(j))) {
                // 1. Handle the "Leading Zero" rule
                if (abbr.charAt(j) == '0') {
                    return false;
                }
    
                // 2. Parse the full number (handles multi-digit numbers like "12")
                int num = 0;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
    
                // 3. Move the word pointer 'i' forward by the parsed value
                i += num;
            } else {
                return false;
            }
        }

        if(i == word.length() && j == abbr.length()){
            return true;
        } else {
            return false;
        }

    }
}