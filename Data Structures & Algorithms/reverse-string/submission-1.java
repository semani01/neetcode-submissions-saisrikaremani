class Solution {
    public void reverseString(char[] s) {
        //Using a Stack
        Stack<Character> st = new Stack<>();

        //Push all elements onto the stack -> order reversed
        for(char c : s){
            st.push(c);
        }

        //Next, pop and update the char array
        for(int i = 0; i < s.length; i++){
            s[i] = st.pop();
        }
    }
}