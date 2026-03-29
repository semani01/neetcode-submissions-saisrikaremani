class Solution {
    public int evalRPN(String[] tokens) {
        //Brute Force
        //In a Stack, keep pushing integers
        //If an operator is encountered, pop 2 and perform operation
        //Into the stack push the result of operation
        //Repeat until end of tokens.length
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        //int num = Integer.parseInt(str)
        for(String str : tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                //Pop two, calculate, and push result
                int b = stack.pop();
                int a = stack.pop();
                switch(str){
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }
                stack.push(result);
            } else {
                //It's a number, push it
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
        

    }
}
