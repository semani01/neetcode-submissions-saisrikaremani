class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //Build frequency maps for both
        //for ransom check if frequency for each alphabet is greater than or equal to
        //the frequency of the corresponding alphabet in magazine
        //if all pass return true, else return false
        Map<Character, Integer> mag = new HashMap<>();
        Map<Character, Integer> ransom = new HashMap<>();

        for(char c : magazine.toCharArray()){
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            ransom.put(c, ransom.getOrDefault(c, 0) + 1);
        }

        for (char c : ransom.keySet()) {
            if (ransom.get(c) > mag.getOrDefault(c, 0)) return false;
        }
        
        return true;
    }
}