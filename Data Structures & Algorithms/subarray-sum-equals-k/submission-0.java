class Solution {
    public int subarraySum(int[] nums, int k) {
        int totalSubArrays = 0;
        for(int i = 0; i < nums.length; i++){

            int subSum = 0;
            for(int j = i; j < nums.length; j++) {
                subSum += nums[j];
                if(subSum == k){
                    totalSubArrays++;
                }

            }
            System.out.println();
        }
        return totalSubArrays;
    }
}