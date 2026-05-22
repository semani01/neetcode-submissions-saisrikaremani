class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Decalre a result array
        int []res = new int[nums.length];

        //Pass 1: Do prefix
        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            res[i] = prefix;
            prefix *= nums[i];
        }

        //Pass 2: Do postfix
        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;
    }
}  
