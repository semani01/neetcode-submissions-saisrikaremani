class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L = 0, R = numbers.length - 1;

        //Two pointers move toward each other in a single pass --> O(n) time
        while(L < R){
            if(numbers[L] + numbers[R] < target){
                L++;
            } else if(numbers[L] + numbers[R] > target){
                R--;
            } else {
                return new int[]{L + 1, R + 1};
            }
        }

        return null;
    }
}
