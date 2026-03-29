class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for(int n = 0; n < nums.length; n++){
            if(curSum < 0)
                curSum = 0;
            //curSum = Math.max(curSum, 0);
            
            curSum += nums[n];
            if(curSum > maxSum)
                maxSum = curSum;
            //maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
