class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; //assign arbitrarily to any index
        int curSum = 0; //a running sum for a subarray

        //a single pass --> O(n)
        for(int n : nums){
            curSum = Math.max(curSum, 0); //making sure curSum > 0
            curSum += n; //adding element in current subarray to curSum
            maxSum = Math.max(maxSum, curSum); //checking and updating maxSum
        }

        return maxSum;
    }
}
