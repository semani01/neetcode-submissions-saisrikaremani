class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Initialize two pointers 
        int L = 0, R = numbers.length - 1;

        //Single pass with two pointers --> O(n) time
        while(L < R){
            if(numbers[L] + numbers[R] > target){
                R--;  
            } else if(numbers[L] + numbers[R] < target){
                L++;
            } else {
                return new int[]{L + 1, R + 1}; //target sum found
            }
        }

        //if no such sum can be found 
        return null;
    }
}
