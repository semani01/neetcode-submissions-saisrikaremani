class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMax = 0, globalMax = nums[0];
        int currentMin = 0, globalMin = nums[0];
        int total = 0;

        //Single pass --> O(n) time
        for(int num : nums){
          //1. Standard Kadane's to find maximum subarray
          currentMax = Math.max(num, currentMax + num);
          globalMax = Math.max(globalMax, currentMax);

          //2. Modified Kadane's to find minimum subarray
          currentMin = Math.min(num, currentMin + num);
          globalMin = Math.min(globalMin, currentMin);

          //3. Keep track of the total sum of the array
          total += num;
        }

        //If all elements are -ve, return the least -ve num i.e. the globalMax
        if(globalMax < 0){
          return  globalMax;
        }


        //Return the better of the two scenarios
        return Math.max(globalMax, total - globalMin);
    }
}