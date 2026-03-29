class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sHashTable = new HashMap<>();
        HashMap<Character, Integer> tHashTable = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (c == ' ') continue;

            sHashTable.put(c, sHashTable.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (c == ' ') continue;

            tHashTable.put(c, tHashTable.getOrDefault(c, 0) + 1);
        }

        if (sHashTable.equals(tHashTable)) {
            return true;
        } else {
            return false;
        }
    }
}
