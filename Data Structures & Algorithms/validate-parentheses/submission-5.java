class Solution {
    public boolean isValid(String s) {
        //Step 1 -> Create a stack
        Stack<Character> stack = new Stack<>(); 
        
        //Step 2 -> Process characters one by one
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            // If it's an opening bracket, push it
            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
            } else {
                // If it's a closing bracket, it must match the top of the stack
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if((current == ')' && top == '(') || 
                   (current == ']' && top == '[') || 
                   (current == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        //If stack is empty --> true(all matching parantheses), false(if not)
        return stack.empty();
    }
}