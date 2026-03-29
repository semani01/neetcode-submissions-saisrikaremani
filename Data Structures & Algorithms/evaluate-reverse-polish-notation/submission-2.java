class Solution {
    public int evalRPN(String[] tokens) {
        //Maintain a stack
        //If character is integer, push to stack
        //Else pop the two recently pushed integers, perform operation, and push result
        //Finally, pop the remaining element in stack which is the final result

        Deque<Integer> stack = new ArrayDeque<>(); 
        int result = 0;

        for(String str : tokens){
            //If str is an operator
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
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
            }
            else { //str is an integer
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
