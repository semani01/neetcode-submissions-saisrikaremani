class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){ //if it's an opening bracket
                stack.push(c);
            
            } else {  //if it's a closing bracket; must match top of stack
                if(stack.isEmpty())
                    return false;

                char top = stack.pop();

                if(c == ')' && top != '(')
                    return false;
                if(c == ']' && top != '[')
                    return false;
                if(c == '}' && top != '{')
                    return false;
            } 
        }
        return stack.isEmpty();
    }
}
