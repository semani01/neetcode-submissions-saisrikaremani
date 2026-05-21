class Solution {

    public String encode(List<String> strs) {
        //Create a new string str
        //Concatenate all strings in list to str
        //Return str 
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append(":").append(s);
        }
        String str = sb.toString();

        System.out.println(str);

        return str;
    }

    public List<String> decode(String str) {
        //Add every whitespace separated string to list of strings
        //Return list
        List<String> strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int colon = str.indexOf(':', i);
            int size = Integer.parseInt(str.substring(i, colon));
            strs.add(str.substring(colon + 1, colon + 1 + size));
            i = colon + 1 + size;
        }

        return strs;
    }
}